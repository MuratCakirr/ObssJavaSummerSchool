import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/origin-servlet")
public class OriginServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (req.getAttribute("flag") == null){
            System.out.println("Origin - Flag 0");
            Date date = java.util.Calendar.getInstance().getTime();
            req.setAttribute("Date", date);
            req.setAttribute("flag","0");
            req.getRequestDispatcher("/destination-servlet").forward(req, resp);
        }

        if (req.getAttribute("flag").equals("1")){
            System.out.println("Origin - Flag 1");
            req.setAttribute("flag","2");
            req.getRequestDispatcher("/destination-servlet").forward(req,resp);
        }


    }

}
