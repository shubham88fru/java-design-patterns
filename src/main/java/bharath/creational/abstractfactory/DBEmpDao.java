package bharath.creational.abstractfactory;

public class DBEmpDao implements IDao {
    @Override
    public void save() {
        System.out.println("Saving employee to db");
    }
}
