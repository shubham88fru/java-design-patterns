package bharath.creational.singleton;

/*
    Lazy singleton. An instance is first created only
    when somewhere in code someone calls the getInstance()
    method. **NOT** as soon as the class is loaded.

    A con of this simple implementation is that it is not
    thread-safe. If 2 thread (or more) threads call the getInstance()
    method at exact same time, then we might end up with multiple instances
    of the singleton class.
 */
public class DateUtilLazyInitialization {

    //Step 3: A static instance object that will
    //hold reference to object of same type.
    private static DateUtilLazyInitialization instance;

    //Step 1: Create a private constructor.
    //None from outside this class can call it.
    private DateUtilLazyInitialization() {

    }

    //Step 2: Expose a public method to get the instance of class
    //This method has to be static so that we don't need and instance
    //to call this method. We can call it directly over the class.
    public static DateUtilLazyInitialization getInstance() {
        //create a new instance only if
        //null, otherwise return same instance.
        if (instance == null) {
            instance = new DateUtilLazyInitialization();
        }

        return instance;
    }
}
