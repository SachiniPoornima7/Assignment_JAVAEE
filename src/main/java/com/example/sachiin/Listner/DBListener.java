package com.example.sachiin.Listner;

import com.example.sachiin.config.SessionFactoryConfiguration;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import org.hibernate.SessionFactory;

public class DBListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        try {

            SessionFactoryConfiguration sessionFactoryConfiguration = SessionFactoryConfiguration.getInstance();
            SessionFactory sessionFactory = sessionFactoryConfiguration.getSession().getSessionFactory();
            ServletContext servletContext = sce.getServletContext();
            servletContext.setAttribute("SessionFactory" , sessionFactory);

            System.out.println("connection set");


        }catch (Exception e ){
          e.printStackTrace();
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
