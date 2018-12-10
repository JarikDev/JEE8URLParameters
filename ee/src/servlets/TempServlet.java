package servlets;

import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.Map;

@WebServlet("/temp")
public class TempServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       /*String one=  req.getParameter("one");
      String two=  req.getParameter("two");
        System.out.println(one +" "+two );
        PrintWriter printWriter=resp.getWriter();
        printWriter.write(one +" "+two);*//*


      *//*String[]ones=  req.getParameterValues("one");
        for (String s:ones) {
            System.out.println(s);

        }*//*

       *//* Enumeration<String> parameterNames = req.getParameterNames();
            while (parameterNames.hasMoreElements()){
                System.out.println(parameterNames.nextElement());
            }*//*

      *//*  Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String elementName = parameterNames.nextElement();
            System.out.println(elementName + " = " + req.getParameter(elementName));
        }
        Map<String, String[]> parameterMap = req.getParameterMap();*//*

        */
       /* System.out.println(req.getServletPath());
        System.out.println(req.getRequestURL());
        System.out.println(req.getRequestURI());
        System.out.println(req.getRemoteHost());
        System.out.println(req.getLocalPort()); */
      //  System.out.println(req.getQueryString());

        String one=req.getParameter("one");
        String two=req.getParameter("two");
        resp.getWriter().write("<html>" +
                "<head></head>" +
                "<body>" +
                " one = "+ one+
                " two = "+ two+
                "<form action='temp' method='post'>" +
                "<input type='text' name='one'/>" +
                "<input type='text' name='two'/>" +
                "<input type='submit' name='submit'/>" +
                "</form>" +
                "</body>" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doGet(req,resp);
    }
}