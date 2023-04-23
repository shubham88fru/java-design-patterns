package bharath.creational.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        DaoAbstractFactory daf = DaoFactoryProducer.produce("xml");
        IDao dao = daf.createDao("emp");
        dao.save();

        DaoAbstractFactory daf2 = DaoFactoryProducer.produce("db");
        IDao dao2 = daf2.createDao("dept");
        dao2.save();
    }
}
