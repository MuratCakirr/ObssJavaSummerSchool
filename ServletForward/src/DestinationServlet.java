import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;

@WebServlet("/destination-servlet")
public class DestinationServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Date date = (Date) req.getAttribute("Date");
        String flag = req.getAttribute("flag").toString();
        PrintWriter out = resp.getWriter();

        if(flag.equals("0")){
            System.out.println("Destination - flag 1");
            req.setAttribute("flag","1");
            req.getRequestDispatcher("/origin-servlet").forward(req,resp);
        }

        if(flag.equals("2")){
            System.out.println("Destination - flag 2");
            out.println(date);
        }

    }
}
