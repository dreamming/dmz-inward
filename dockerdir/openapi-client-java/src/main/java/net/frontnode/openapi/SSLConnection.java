package net.frontnode.openapi;


import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.ssl.SSLContexts;

import javax.net.ssl.SSLContext;
import java.io.*;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

/**
 * @author dmz
 * @tag
 * @memo 2016/6/2
 */
public abstract class SSLConnection  {
        private String KEY_STORE_PATH="C:\\Users\\dmz\\IdeaProjects\\openapi-client-java\\src\\main\\java\\net\\frontnode\\openapi\\keystore.jks";
        private String TRUST_STORE_PATH="C:\\Users\\dmz\\IdeaProjects\\openapi-client-java\\src\\main\\java\\net\\frontnode\\openapi\\truststore.jks";
        private String KEY_STORE_PASSWD="123456";
        private String TRUST_STORE_PASSWD="123456";
        private String VERSION="TLSv1.2";
        protected Registry<ConnectionSocketFactory> socketFactoryRegistry;

        protected void initSSLConnection() throws UnrecoverableKeyException, CertificateException, NoSuchAlgorithmException, KeyStoreException, IOException, KeyManagementException {

            SSLContext context = SSLContexts.custom()
                    .loadKeyMaterial(new File(this.KEY_STORE_PATH),
                            this.KEY_STORE_PASSWD.toCharArray(),
                            this.TRUST_STORE_PASSWD.toCharArray())
                    .loadTrustMaterial(new File(this.TRUST_STORE_PATH),
                            this.TRUST_STORE_PASSWD.toCharArray())
                    .build();

            SSLConnectionSocketFactory sf = new SSLConnectionSocketFactory(
                    context,
                    new String[]{this.VERSION},
                    null,
                    SSLConnectionSocketFactory.getDefaultHostnameVerifier());

            socketFactoryRegistry = RegistryBuilder
                    .<ConnectionSocketFactory> create().register("https", sf)
                    .build();
        }
    public String getKEY_STORE_PATH() {
        return KEY_STORE_PATH;
    }

    public void setKEY_STORE_PATH(String KEY_STORE_PATH) {
        this.KEY_STORE_PATH = KEY_STORE_PATH;
    }

    public String getTRUST_STORE_PATH() {
        return TRUST_STORE_PATH;
    }

    public void setTRUST_STORE_PATH(String TRUST_STORE_PATH) {
        this.TRUST_STORE_PATH = TRUST_STORE_PATH;
    }

    public String getKEY_STORE_PASSWD() {
        return KEY_STORE_PASSWD;
    }

    public void setKEY_STORE_PASSWD(String KEY_STORE_PASSWD) {
        this.KEY_STORE_PASSWD = KEY_STORE_PASSWD;
    }

    public String getTRUST_STORE_PASSWD() {
        return TRUST_STORE_PASSWD;
    }

    public void setTRUST_STORE_PASSWD(String TRUST_STORE_PASSWD) {
        this.TRUST_STORE_PASSWD = TRUST_STORE_PASSWD;
    }

    public String getVERSION() {
        return VERSION;
    }

    public void setVERSION(String VERSION) {
        this.VERSION = VERSION;
    }
}
