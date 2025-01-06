package com.koreait.servlet_study.servlet;

import entity.User;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/user")

public class UserServlet extends HttpServlet{


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = req.getServletContext();
        List<User> users = (List<User>) servletContext.getAttribute("users");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UFT-8");
        System.out.println(req.getParameter("username"));
        System.out.println(req.getParameter("password"));
        System.out.println(req.getParameter("name"));
        System.out.println(req.getParameter("email"));
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println(
                "<script>"
                        + "alert(\"등록이 완료되었습니다.\");"
                        + "location.href = 'http://localhost:8080/servlet_study_war/product/user';" +
                "</script>"
        );
    }

    @Override
    public void init(ServletConfig config) throws SecurityException {
        List<User> users = new ArrayList<>();
        users.add(new User("aaa", "1111", "aaaaaa", "aaa@gamil.com"));
        users.add(new User("bbb", "1111", "bbbbbb", "bbb@gamil.com"));
        users.add(new User("ccc", "1111", "cccccc", "ccc@gamil.com"));
        users.add(new User("ddd", "1111", "dddddd", "ddd@gamil.com"));
        users.add(new User("eee", "1111", "eeeeee", "eee@gamil.com"));

        config.getServletContext().setAttribute("users", users);


    }
}
