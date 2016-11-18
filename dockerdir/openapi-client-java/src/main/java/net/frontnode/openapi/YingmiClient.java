package net.frontnode.openapi;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.frontnode.openapi.HttpsClient;
import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.BASE64Encoder;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.security.*;
import java.security.cert.CertificateException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author dmz
 * @tag
 * @memo 2016/6/2
 */
public class YingmiClient extends HttpsClient  {

    private static final String HMAC_SHA1_ALGORITHM = "HmacSHA1";

    private static Logger logger = LoggerFactory.getLogger(YingmiClient.class);

    private DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");

    private String apiKey="b3697ad6-9e53-47a1-a223-8913e775db09";

    private String apiSecret="2de66173f31cce37edcfe7daa633b01cc0b9f8b976d9fda7caa1542feb327075";

    private String host="api-test.frontnode.net";

    private String basePath="/v1";

    private ObjectMapper objectMapper = new ObjectMapper();

    private String getSig(String method, String path, String apiSecret, Map<String, String> params){
        StringBuilder sb = new StringBuilder();

        Set<String> keySet = new TreeSet<>(params.keySet());
        for (String key: keySet) {
            String value = params.get(key);
            if (value == null) {
                continue;
            }
            sb.append(key);
            sb.append("=");
            sb.append(params.get(key));
            sb.append("&");
        }
        sb.setLength(sb.length() - 1); // trim the last "&"
        String unifiedString = method.toUpperCase() + ":" + path + ":" + sb.toString();
        logger.debug("unified string: " + unifiedString);

        // calc hmac sha1
        try {
            SecretKeySpec secret = new SecretKeySpec(apiSecret.getBytes(), HMAC_SHA1_ALGORITHM);
            Mac mac = Mac.getInstance(HMAC_SHA1_ALGORITHM);
            mac.init(secret);
            byte[] hmac = mac.doFinal(unifiedString.getBytes()); // UTF8

            // base64 encode the hmac
            String sig = new BASE64Encoder().encode(hmac);
//            logger.debug("signature: " + sig);
            return sig;
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }

    public YingmiClient(){
        try {
            this.initHttpsClient();
        } catch (CertificateException e) {
            e.printStackTrace();
        } catch (UnrecoverableKeyException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String postOneMethod(String path,Map<String, String> params){

        String sig = getSig("POST", path, apiSecret, params);
        params.put("sig", sig);
        return post(host,basePath+path,params);

    }

    public String getOneMethod(String path,Map<String,String> params){
        String sig = getSig("GET", path, apiSecret, params);
        params.put("sig", sig);
        return get(host,basePath+path,params);
    }

    public <T> T requestOne(String method,String path,Map<String, String> params,Class<T> clazz) throws IOException {
        String json = completeParameterSend(method,path,params);
        return objectMapper.readValue(json, clazz);
    }

    public <T> T requestSome(String method,String path,Map<String, String> params,TypeReference<T> valueTypeRef) throws IOException {
        String json = completeParameterSend(method,path,params);
        return objectMapper.readValue(json, valueTypeRef);
    }

    public String completeParameterSend(String method,String path,Map<String, String> params){
        params.put("key", apiKey);
        params.put("sigVer", "1");
        String ts = format.format(new Date());
        params.put("ts", ts);
        params.put("nonce", RandomStringUtils.randomAlphanumeric(16));
        String sig = getSig(method, path, apiSecret, params);
        params.put("sig", sig);
        return get(host,basePath+path,params);
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiSecret() {
        return apiSecret;
    }

    public void setApiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

}
