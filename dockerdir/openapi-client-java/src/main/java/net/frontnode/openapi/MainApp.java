package net.frontnode.openapi;

import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jiankuan
 *         9/11/15.
 */
public class MainApp {

    public static void main(String[] args) throws KeyStoreException, CertificateException, NoSuchAlgorithmException, IOException {
//        request.setAccountId("5meksel7knd6");
//        request.setBrokerUserId("dmzvsdmz");
//        params.put("brokerUserId", request.getBrokerUserId());
//        params.put("accountId", request.getAccountId());
//        InnerHttpResponse resp = httpsClient.processGet("/account/getAccount", params);
        final Map<String, String> params = new HashMap<>();
        params.put("brokerUserId", "dmzvsdmz");
        params.put("accountId", "5meksel7knd6");
        final YingmiClient y = new YingmiClient();


        for (int i = 0; i < 2; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
//                    String str = y.completeParameterSend("GET", "/account/getAccount", params);
//                    System.out.println(params.toString());
//                    System.out.println(str);
                    System.out.println(y.completeParameterSend("GET", "/utils/getPaymentProviders", new HashMap<String, String>()));

                }
            }).start();
        }
        System.out.println("---------------------------------------------------------");
        System.out.println(y.completeParameterSend("GET", "/utils/getPaymentProviders", new HashMap<String, String>()));
        System.out.println("---------------------------------------------------------");

//        Options options = new Options();
//        options.addOption("host", true, "yingmi openapi host name, default is \"api-test.frontnode.net\"");
//        options.addOption("keystore", true, "path of key store");
//        options.addOption("kp", true, "key store password");
//        options.addOption("truststore", true, "path of trust store");
//        options.addOption("tp", true, "trust store password");
//        options.addOption("key", true, "api key");
//        options.addOption("secret", true, "api secret");
//        options.addOption("h", "help", false, "show usage");
//
//        CommandLineParser commandLineParser = new DefaultParser();
//        CommandLine commandLine = null;
//        try {
//            commandLine = commandLineParser.parse(options, args);
//        } catch (ParseException e) {
//            showUsage(options);
//            System.exit(-1);
//        }
//
//        if (commandLine.hasOption("h")) {
//            showUsage(options);
//            System.exit(0);
//        }

//        final Map<String, String> params = new HashMap<>();
////        String[] paramNames = new String[]{"keystore", "kp", "truststore", "tp", "key", "secret"};
////        for (String paramName: paramNames) {
////            if (commandLine.hasOption(paramName)) {
////                params.put(paramName, commandLine.getOptionValue(paramName));
////            } else {
////                System.err.println("缺少必要参数" + paramName);
////                showUsage(options);
////                System.exit(-1);
////            }
////        }
////
////        // optional param 'host'
////        params.put("host", commandLine.getOptionValue("host"));
//        params.put("key","b3697ad6-9e53-47a1-a223-8913e775db09");
//        params.put("secret","K2P0nxLZD8VpSfBf4GPcxs7WaUHkLcjh");
//        params.put("keystore","C:\\Users\\dmz\\IdeaProjects\\openapi-client-java\\src\\main\\java\\net\\frontnode\\openapi\\keystore.jks");
//        params.put("truststore","C:\\Users\\dmz\\IdeaProjects\\openapi-client-java\\src\\main\\java\\net\\frontnode\\openapi\\truststore.jks");
//        params.put("kp","123456");
//        params.put("tp","123456");
//
//
//
//        // invoke the api
//        for (int i = 0; i < 10; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    final YingmiApiClient ac = new YingmiApiClient(
//                            params.get("host"),
//                            params.get("key"),
//                            params.get("secret"),
//                            params.get("keystore"),
//                            params.get("kp"),
//                            params.get("truststore"),
//                            params.get("tp"));
//                    List<FundSearchInfo> funds = ac.getFundsSearchInfo();
//                    for (FundSearchInfo fund: funds) {
//                        System.out.println(fund.fundCode);
//                                              System.out.println(fund.fundName);
//                        break;
//                    }
//                    System.out.println("============");
//
////                    System.out.println(String.format("总共%d只基金", funds.size()));
////                    Account account = new Account();
////                    account.setAccountName("HelloWorld");
////                    account.setBrokerUserId("123");
////                    account.setPaymentNo("882839924394889258234");
////                    account.setPaymentType("bank:002");
////                    account.setIdentityNo("320372395009498195");
////                    String accountInfo = ac.createAccount(account);
////                    System.out.println(accountInfo);
//                }
//            }).start();
//        }


    }


}
