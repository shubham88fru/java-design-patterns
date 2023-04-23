package bharath.creational.abstractfactory;

public class XMLDeptDao implements IDao {
    @Override
    public void save() {
        System.out.println("Saving dept to xml");
    }
}
