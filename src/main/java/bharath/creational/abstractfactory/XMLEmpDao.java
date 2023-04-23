package bharath.creational.abstractfactory;

public class XMLEmpDao implements IDao {
    @Override
    public void save() {
        System.out.println("Saving employee to xml");
    }
}
