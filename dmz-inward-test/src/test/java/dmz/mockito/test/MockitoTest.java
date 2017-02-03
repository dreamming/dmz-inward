package dmz.mockito.test;

import junit.framework.TestCase;
import org.mockito.Mockito;

/**
 * @author dmz
 * @date 2017/1/3
 */
class AStatic {
    public static int get() {
        return 10;
    }
}
class A {
    private int anInt;

    public void setAnInt() {
        this.anInt = AStatic.get();
    }

    public void showA() {
        System.out.println(anInt);
    }
}

public class MockitoTest extends TestCase {


    public  void test() {
        A a = Mockito.mock(A.class);
        a.setAnInt();
        a.showA();
    }
}
