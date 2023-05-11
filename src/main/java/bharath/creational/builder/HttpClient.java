package bharath.creational.builder;

public class HttpClient {
    private String method;
    private String url;
    private String username;
    private String password;
    private String headers;

    private String body;

    private HttpClient(HttpClientBuilder builder) {
        this.body = builder.body;
        this.headers = builder.headers;
        this.method = builder.method;
        this.password = builder.password;
        this.url = builder.url;
        this.username = builder.username;
    }

    public static class HttpClientBuilder {
        private String method;
        private String url;
        private String username;
        private String password;
        private String headers;
        private String body;

        public HttpClientBuilder withMethod(String method) {
            this.method = method;
            return this;
        }

        public HttpClientBuilder withUrl(String url) {
            this.url = url;
            return this;
        }

        public HttpClientBuilder withUserName(String username) {
            this.username = username;
            return this;
        }

        public HttpClientBuilder withPass(String pass) {
            this.password = pass;
            return this;
        }

        public HttpClientBuilder withHeaders(String headers) {
            this.headers = headers;
            return this;
        }

        public HttpClientBuilder withBody(String body) {
            this.body = body;
            return this;
        }

        public HttpClient build() {
            return new HttpClient(this);
        }
    }


    @Override
    public String toString() {
        return "HttpClient{" +
                "method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", headers='" + headers + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
