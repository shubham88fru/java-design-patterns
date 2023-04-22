package bharath.creational.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        DateUtilLazyInitialization dateUtilLazyInitialization1 = DateUtilLazyInitialization.getInstance();
        DateUtilLazyInitialization dateUtilLazyInitialization2 = DateUtilLazyInitialization.getInstance();

        DateUtilEagerInitialization dateUtilEagerInitialization1 = DateUtilEagerInitialization.getInstance();
        DateUtilEagerInitialization dateUtilEagerInitialization2 = DateUtilEagerInitialization.getInstance();

        DateUtilEnumSingleton dateUtilEnumSingleton1 = DateUtilEnumSingleton.INSTANCE;
        DateUtilEnumSingleton dateUtilEnumSingleton2 = DateUtilEnumSingleton.INSTANCE;

        //both instances should be same.
        System.out.println(dateUtilLazyInitialization1 == dateUtilLazyInitialization2);
        System.out.println(dateUtilEagerInitialization1 == dateUtilEagerInitialization2);
        System.out.println(dateUtilEnumSingleton1 == dateUtilEnumSingleton2);
    }
}
