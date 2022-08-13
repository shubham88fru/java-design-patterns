package chain_responsibility;

public class HttpRequest {
    private final String username;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    private final String password;

    public HttpRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
