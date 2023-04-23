package bharath.creational.factory.assignment;

//Factory
public class PersonFactory {
    public static IPerson createPerson(String type) {
        IPerson p = null;
        switch (type) {
            case "male":
                p = new Male();
                break;
            case "female":
                p = new Female();
                break;
        }
        return p;
    }
}
