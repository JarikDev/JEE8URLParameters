package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/rs")
public class ReturnStatus extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//         resp.setStatus(200);
//         resp.setStatus(HttpServletResponse.SC_OK);
//        resp.sendRedirect("/hello");
//     resp.sendError(HttpServletResponse.SC_BAD_REQUEST,"My love is near");
//        resp.setHeader("Refresh","1");
//        System.out.println("hello");
        resp.setHeader("refresh","5;URL=https://google.com");
    }
}
