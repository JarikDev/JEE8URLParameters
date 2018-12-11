package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookies")
public class Cookies extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
//            System.out.println(cookie.getName());
//            System.out.println(cookie.getValue());
            System.out.println("Cookie name: "+cookie.getName()+" Cookie value: "+cookie.getValue());
            System.out.println(cookie.getMaxAge());
        }
        Cookie cookie = new Cookie("cookieName", "cookieValue");
        resp.addCookie(cookie);
        Cookie cookie2 = new Cookie("anotherCookie", "AnotherCookieValue");
//        cookie2.setMaxAge(5);
        resp.addCookie(cookie2);
//        cookie.setPath("/cookies");
//        cookie.setDomain("");
//        cookie.setHttpOnly(true);
//        cookie.setSecure(true);

    }

}
