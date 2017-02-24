package dmz.lock;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author dmz
 * @date 2017/2/6
 */
//自動旋鎖
// 自旋锁是采用让当前线程不停地的在循环体内执行实现的，当循环的条件被其他线程改变时 才能进入临界区
//由于自旋锁只是将当前线程不停地执行循环体，不进行线程状态的改变，所以响应速度更快。
// 但当线程数不停增加时，性能下降明显，因为每个线程都需要执行，占用CPU时间。如果线程竞争不激烈，并且保持锁的时间段。适合使用自旋锁。
// 该例子为非公平锁，获得锁的先后顺序，不会按照进入lock的先后顺序进行
public class SpinLock {

    private AtomicReference<Thread> reference = new AtomicReference<>();

    public void lock() throws InterruptedException {
        Thread thread = Thread.currentThread();
        while (!reference.compareAndSet(null, thread)) {
            System.out.println("waiting....");
            Thread.sleep(1000);
        }
    }

    public void unLock() {
        Thread thread = Thread.currentThread();
        reference.compareAndSet(thread, null);
    }
}
