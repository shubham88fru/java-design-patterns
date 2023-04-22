package bharath.creational.singleton.assignment;

/*
    Lazy, thread safe and non-cloneable singleton.
 */
public class Logger implements Cloneable {

    private static volatile Logger instance;

    private Logger() {

    }

    public static Logger getInstance() {
        if (instance != null) return instance;
        synchronized (Logger.class) {
            if (instance == null) {
                instance = new Logger();
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }

    @Override
    public Logger clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
