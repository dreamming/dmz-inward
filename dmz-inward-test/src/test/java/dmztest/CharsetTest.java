package dmztest;

import org.apache.commons.lang3.CharEncoding;
import org.apache.log4j.Logger;

import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.util.Set;

/**
 * Created by dmz on 2016/7/12.
 */
public class CharsetTest {
    private static final Logger LOGGER = Logger.getLogger(CharsetTest.class);
    public static void main(String args[]) throws CharacterCodingException, InterruptedException {
        for (int i = 0; i < 10; i++) {
            LOGGER.error("Info log [" + i + "].");
            Thread.sleep(500);
        }
//        SortedMap<String, Charset> map = Charset.availableCharsets();
//        for (String key : map.keySet()) {
//            System.out.println(map.get(key));
//        }
//        ByteBuffer buffer = null;
//        Charset gbk = Charset. forName( "GBK");
//        gbk.newDecoder().decode(buffer);
//        gbk.decode(buffer);
        System.out.println(Charset.isSupported(CharEncoding.UTF_8));
        Charset charset = Charset.forName(CharEncoding.UTF_8);
        System.out.println(charset.name());
        Set<String> alias = charset.aliases();
        for (String alia : alias) {
            System.out.println(alia);
        }
    }
}
