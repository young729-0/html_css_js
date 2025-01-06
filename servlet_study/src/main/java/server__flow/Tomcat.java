package server__flow;

public class Tomcat {
    public static void service(String url, String method) {
        Request req = new Request();
        Response resp = new Response();

        TestFilter.doFilter(req, resp);
    }
}
