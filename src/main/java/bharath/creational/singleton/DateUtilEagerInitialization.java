package bharath.creational.singleton;

/*
    Eager singleton. Singleton instance is created
    as soon as class is loaded. Doesn't wait until
    someone calls the getInstance() method.

    Pro is that it is always thread-safe, since a class
    is loaded only once by a jvm. However, con might be that
    this instance will linger around in memory even when nobody is
    using it. So, this is preferred only when we are sure that
    an instance of this class is certainly needed by our app.
 */
public class DateUtilEagerInitialization {

    //Instance is create as soon as class is loader by class loader.
    private static final DateUtilEagerInitialization instance
            = new DateUtilEagerInitialization();

    private DateUtilEagerInitialization() {

    }

    public static DateUtilEagerInitialization getInstance() {
        return instance;
    }
}
