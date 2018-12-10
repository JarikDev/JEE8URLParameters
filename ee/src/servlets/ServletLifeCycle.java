package servlets;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("initialization");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Do get Method");

        String s="<html>"+"<header><title>This is title</title></header>"+
                "<body>"+
                "Hello world from my servlet"+
                "</body>"+
                "</html>";
        resp.getWriter().write(s);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Service method");
        super.service(req, res);
    }

    @Override
    public void destroy() {
        System.out.println("Destroy ");
    }
}
