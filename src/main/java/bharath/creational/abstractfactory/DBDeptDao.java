package bharath.creational.abstractfactory;

public class DBDeptDao implements IDao {
    @Override
    public void save() {
        System.out.println("Saving dept to db");
    }
}
