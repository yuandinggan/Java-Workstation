package cn.reaper.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("contextInitialized:上下文初始化");
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        ServletContext servletContext=servletContextEvent.getServletContext();
        servletContext.setAttribute("app",app);
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("contextDestroyed:上下文销毁");
    }
}
