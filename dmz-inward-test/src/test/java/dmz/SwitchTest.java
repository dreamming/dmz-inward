package dmz;

/**
 * @author dmz
 * @date 2017/1/2
 */
class A{
    public static char a = 1;
}
public class SwitchTest {
    public static void main(String[] args) {
        switch (A.a) {
            case 1:
                System.out.println(1);
//                break;
            case 2:
                System.out.println(2);
                break;
        }
    }
}
