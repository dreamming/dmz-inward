package dmz.lock;

/**
 * @author dmz
 * @date 2017/2/6
 */
public class TicketLockStart {


    public static void main(String[] args) throws InterruptedException {
        final  TicketLock ticketLock = new TicketLock();
//        ticketLock.lock();

        for (int i=0;i<10;i++) {
            new Thread(()->{
                try {
                    ticketLock.lock();
                    System.out.println(Thread.currentThread().getId()+" acquired the lock!");
                    ticketLock.unLock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
//        System.out.println("main thread unlock!");
//        ticketLock.unLock();
    }
}
