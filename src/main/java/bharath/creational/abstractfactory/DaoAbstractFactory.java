package bharath.creational.abstractfactory;

/*
    The abstract factory pattern is factory of factories.
 */
public abstract class DaoAbstractFactory {
    public abstract IDao createDao(String type);
}
