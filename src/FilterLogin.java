import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by томат on 14.06.2017.
 */
@WebFilter(filterName = "FilterLogin")
public class FilterLogin implements Filter {
    public static final String LOGIN_PAGE="start.jsp";
    String username;
    String password;
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        username = req.getParameter("userName");
        password = req.getParameter("password");

        System.out.println("!!   "+ username+" "+password);
        if (username.length()==0 | password.length()==0) {
            System.out.println("filter find not parameters");
            req.setAttribute("message","no login/password");
            RequestDispatcher dispatcher = req.getRequestDispatcher(LOGIN_PAGE);
            dispatcher.forward(req, resp);
        }

        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }
    public void destroy() {
    }

}