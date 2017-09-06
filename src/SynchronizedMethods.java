public class SynchronizedMethods {
    //Write three different method options for getNextValue() that will return (value++); each method needs to be synchronized in a different way.
    private final Object lock = new Object();

    private int value = 0;

    public synchronized int getNextValue1() {
        return value++;
    }

    public int getNextValue2() {
        synchronized (this) {
            return value++;
        }
    }

    public int getNextValue3() {
        synchronized (lock) {
            return value++;
        }
    }

}
