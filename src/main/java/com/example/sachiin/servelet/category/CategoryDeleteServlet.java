package com.example.sachiin.servelet.category;

import com.example.sachiin.BoLayer.Bo.CategoryBo;
import com.example.sachiin.BoLayer.BoFactory;
import com.example.sachiin.BoLayer.BoType;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;


@WebServlet(name = "CategoryDeleteServlet" , value = "/category-delete")

public class CategoryDeleteServlet extends HttpServlet {

    CategoryBo categoryBo = (CategoryBo) BoFactory.getBoFactory().getBo(BoType.CATEGORY);


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");

        boolean b = categoryBo.deleteProducts(id);

        if (b) {
//            req.getSession().setAttribute("registrationStatus", "success");
            resp.sendRedirect("category-delete.jsp");
        } else {
//            req.getSession().setAttribute("registrationStatus", "error");
            resp.sendRedirect("AdminDash.jsp");
        }
    }
}
