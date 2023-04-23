package bharath.creational.abstractfactory;

/*
    Note here in abstract factory pattern the factories
    extend an abstract class, unlike a simple factory
    pattern where the factory class doesn't.
 */
public class DBDaoFactory extends DaoAbstractFactory {
    @Override
    public IDao createDao(String type) {
        IDao dao = null;
        if (type.equals("emp")) {
            dao = new DBEmpDao();
        } else if (type.equals("dept")) {
            dao = new DBDeptDao();
        }
        return dao;
    }
}
