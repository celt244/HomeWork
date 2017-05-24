import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Arthur on 25.05.2017.
 */

@WebServlet("/userInfo")
public class UserInfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        req.getRequestDispatcher("userInfo.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("user_name");
        int age = Integer.parseInt(req.getParameter("user_age"));
        String password = req.getParameter("user_password");
        String city = req.getParameter("city");
        String message = req.getParameter("message");

        System.out.println("user_name " + name);
        System.out.println("user_age " + age);
        System.out.println("user_password " + password);
        System.out.println("city " + city);
        System.out.println("message " + message);

        req.getRequestDispatcher("userInfo.jsp").forward(req, resp);


    }
}
