package bharath.creational.singleton;

/*
    Thread safe lazy singleton.
 */
public class DateUtilLazyIntializationThreadSafe {

    private static volatile DateUtilLazyIntializationThreadSafe instance;


    private DateUtilLazyIntializationThreadSafe() {

    }

    public static DateUtilLazyIntializationThreadSafe getInstance() {
        //if instance already exists, no need to take lock.
        if (instance != null) return instance;

        //else take lock on the class and create instance.
        synchronized (DateUtilLazyIntializationThreadSafe.class) {
            if (instance == null) {
                instance = new DateUtilLazyIntializationThreadSafe();
            }
        }
        return instance;
    }
}
