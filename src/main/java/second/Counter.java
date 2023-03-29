package second;

public class Counter {
    private static Integer counter = 0;

    Counter() {}

    public static Integer getCounter() {
        return counter;
    }

    public static Integer incr() {
        synchronized (Counter.class) {
            counter += 1;
            return counter;
        }
    }
}
