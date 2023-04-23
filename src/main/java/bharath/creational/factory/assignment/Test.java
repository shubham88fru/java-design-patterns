package bharath.creational.factory.assignment;

public class Test {
    public static void main(String[] args) {
        IPerson p = PersonFactory.createPerson("male");
        p.wish("wish");
    }
}
