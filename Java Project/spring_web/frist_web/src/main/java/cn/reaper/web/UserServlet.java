package cn.reaper.web;

import cn.reaper.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = app.getBean(UserService.class);
        userService.save();

//        ServletContext servletContext=this.getServletContext();
//        ApplicationContext app=(ApplicationContext) servletContext.getAttribute("app");
//        UserService userService=app.getBean(UserService.class);
//        userService.save();
    }
}
