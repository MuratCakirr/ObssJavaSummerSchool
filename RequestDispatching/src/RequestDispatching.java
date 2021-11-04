import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/request-dispatcher")
public class RequestDispatching extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");

        if("index".equals(name)){
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }else if("index1".equals(name)){
            req.getRequestDispatcher("index1.jsp").forward(req,resp);
        }else {
            req.getRequestDispatcher("index2.jsp").forward(req,resp);
        }

    }
}
