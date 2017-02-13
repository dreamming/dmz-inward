package dmz.lock;

import java.util.concurrent.locks.LockSupport;

/**
 * @author dmz
 * @date 2017/2/7
 */
//綫程的阻塞與喚醒
public class LockSupportStart {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            LockSupport.park(); //阻塞

//                Thread.sleep(10000);
            System.out.println(Thread.currentThread().getId() + " awake!");
        });
        t.start();
        Thread.sleep(1000);
        t.interrupt();

    }
}
