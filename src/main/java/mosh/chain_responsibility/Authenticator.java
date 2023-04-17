package mosh.chain_responsibility;

public class Authenticator extends Handler {
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("authentication..");
        return !(request.getUsername().equals("admin")
                && request.getPassword().equals("1234"));
    }
}
