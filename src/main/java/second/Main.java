package second;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Incrementator inc = new Incrementator(new Object());
        Thread t = new Thread(inc);
        Thread t1 = new Thread(inc);
        t.start();
        t1.start();
        t.join();
        t1.join();

    }
}
