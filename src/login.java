import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Created by томат on 13.06.2017.
 */
@WebServlet(name = "login")
public class login extends HttpServlet {
    private String username;
    private String password;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = null;
        session = request.getSession(false);
        System.out.println(session);
        request.setCharacterEncoding("utf-8");
        username = request.getParameter("username");
        password = request.getParameter("password");
        //session.setAttribute(username, password);
    }
}
