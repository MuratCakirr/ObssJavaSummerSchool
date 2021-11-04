import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/origin-servlet1")
public class OriginServlet1 extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        resp.setContentType("text/html");

        if (servletContext.getAttribute("flag") == null){
            System.out.println("Origin1 - Flag 0");
            Date date = java.util.Calendar.getInstance().getTime();
            servletContext.setAttribute("Date",date);
            servletContext.setAttribute("flag","0");
            req.getRequestDispatcher("/destination-servlet1").forward(req,resp);
        }

        if (servletContext.getAttribute("flag").equals("1")){
            System.out.println("Origin1 - Flag 1");
            Date date = java.util.Calendar.getInstance().getTime();
            servletContext.setAttribute("Date",date);
            servletContext.setAttribute("flag","2");
            req.getRequestDispatcher("/destination-servlet1").forward(req,resp);
        }

    }
}
