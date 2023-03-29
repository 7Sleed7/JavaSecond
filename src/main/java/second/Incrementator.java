package second;

public class Incrementator implements Runnable {
    private final Object res;
    private boolean isActive;

    void disable() {
        isActive = false;
    }

    Incrementator(Object res) {
        this.res = res;
    }

    public void run() {
        Counter counter = new Counter();
        while (Counter.getCounter() <= 100) {
            Integer count = counter.incr();
//            System.out.println("1");
            synchronized (res) {
                if (count == 100) {
                    try {
                        res.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + " is Winner");
                } else if (count > 100) {
                    System.out.println(Thread.currentThread().getName() + " is loser");
                    res.notify();
                }
            }
        }
    }
}
