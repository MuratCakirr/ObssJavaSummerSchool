import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/servlet-secure")
public class Servlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String word = req.getQueryString();

        if("secured".equals(word)){
            resp.setStatus(HttpServletResponse.SC_FORBIDDEN);

        }else {
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }

    }

}
