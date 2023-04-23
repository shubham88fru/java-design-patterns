package bharath.creational.abstractfactory;

public class XMLDaoFactory extends DaoAbstractFactory {
    @Override
    public IDao createDao(String type) {
        IDao dao = null;
        if (type.equals("emp")) {
            dao = new XMLEmpDao();
        } else if (type.equals("dept")) {
            dao = new XMLDeptDao();
        }
        return dao;
    }
}
