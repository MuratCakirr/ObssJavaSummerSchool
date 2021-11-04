import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculator")
public class FirstJSP extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Hello World");
    }

    /*@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        System.out.println("Get num1: " + num1);
        System.out.println("Get num2: " + num2);

        int total = num1 + num2;
        PrintWriter out = resp.getWriter();

        out.println("Get total: " + total);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        System.out.println("Post num1: " + num1);
        System.out.println("Post num2: " + num2);

        int total = num1 + num2;
        PrintWriter out = resp.getWriter();

        out.println("Post total: " + total);
    }*/

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        String method = req.getMethod();

        System.out.println("Service " + method + " num1: " + num1 + " name: " + name);
        System.out.println("Service " + method + " num2: " + num2);

        int total = num1 + num2;
        PrintWriter out = resp.getWriter();

        out.println("Service total: " + total);
        out.println("Service name: " + name);

    }

    @Override
    public void destroy() {
        System.out.println("Finish");
    }
}
