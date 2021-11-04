import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/name")
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        System.out.println("Get name: " + name);
        System.out.println("Get surname: " + surname);

        String fullName = name + surname;

        PrintWriter out = resp.getWriter();
        out.println("Get " + fullName);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        System.out.println("Post name: " + name);
        System.out.println("Post surname: " + surname);

        String fullName = name + surname;

        PrintWriter out = resp.getWriter();
        out.println("Post " + fullName);
    }
}
