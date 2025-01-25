package com.example.sachiin.servelet.User;

import com.example.sachiin.BoLayer.Bo.UserBo;
import com.example.sachiin.BoLayer.BoFactory;
import com.example.sachiin.BoLayer.BoType;
import com.example.sachiin.dto.UserDto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Timestamp;


@WebServlet(name = "UserServlet" , value = "/Registration")
public class UserRegistrationServlet extends HttpServlet {

    UserBo userBo = (UserBo) BoFactory.getBoFactory().getBo(BoType.USER);
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {

            String username = req.getParameter("username");
            String email = req.getParameter("email");
            String password = req.getParameter("password"); // Consider hashing the password
            String role = req.getParameter("role");
            boolean isActive = true; // Default active status
            Timestamp createdAt = new Timestamp(System.currentTimeMillis());

            UserDto user = new UserDto(0, username, email, password, isActive, role, createdAt);

            boolean b = userBo.SaveUsers(user);

            if (b) {
                req.getSession().setAttribute("registrationStatus", "success");
                resp.sendRedirect("Registration.jsp");
            } else {
                req.getSession().setAttribute("registrationStatus", "error");
                resp.sendRedirect("Registration.jsp");
            }


        }catch (Exception e ){
            e.printStackTrace();
            req.setAttribute("registrationStatus", "error");
        }

    }
}
