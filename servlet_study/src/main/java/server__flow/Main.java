package server__flow;

public class Main {
    public static void main(String[] args) {
        Tomcat.service("http://localhost:8080/product/register", "Get");
    }
}
