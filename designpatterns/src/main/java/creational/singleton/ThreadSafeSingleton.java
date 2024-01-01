package creational.singleton;

import java.io.Serializable;

public class ThreadSafeSingleton implements Serializable {
    private static ThreadSafeSingleton INSTANCE = null;

    private ThreadSafeSingleton(){}

    public static ThreadSafeSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ThreadSafeSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
