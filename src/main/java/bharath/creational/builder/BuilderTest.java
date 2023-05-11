package bharath.creational.builder;

public class BuilderTest {
    public static void main(String[] args) {
        HttpClient client = new HttpClient.HttpClientBuilder()
                .withUserName("Shubham")
                .withPass("123")
                .withBody("Six pack abs")
                .withUrl("https://shubham.me")
                .withMethod("POST")
                .build();

        System.out.println(client);
    }
}
