import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/destination-servlet1")
public class DestinationServlet1 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        resp.setContentType("text/html");

        Date date = (Date) servletContext.getAttribute("Date");
        String flag = servletContext.getAttribute("flag").toString();
        PrintWriter out = resp.getWriter();

        if(flag.equals("0")){
            System.out.println("Destination - flag 1");
            servletContext.setAttribute("flag","1");
            servletContext.getRequestDispatcher("/origin-servlet1").forward(req,resp);
        }

        if(flag.equals("2")){
            System.out.println("Destination - flag 2");
            out.println(date);
        }

    }

}
