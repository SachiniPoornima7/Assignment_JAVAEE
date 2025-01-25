package com.example.sachiin.servelet.category;

import com.example.sachiin.BoLayer.Bo.CategoryBo;
import com.example.sachiin.BoLayer.BoFactory;
import com.example.sachiin.BoLayer.BoType;
import com.example.sachiin.dto.CategoryDto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Timestamp;


@WebServlet(name = "CategorySaveServelet" , value = "/category-save")

public class CategorySaveServelet extends HttpServlet {


    CategoryBo categoryBo = (CategoryBo) BoFactory.getBoFactory().getBo(BoType.CATEGORY);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");
        String name = req.getParameter("name");
        Timestamp createdAt = new Timestamp(System.currentTimeMillis());

//        Category category = new Category(id, name, createdAt);
//        Session session = SessionFactoryConfiguration.getInstance().getSession();
//        Transaction transaction = session.beginTransaction();
//        session.save(category);
//        transaction.commit();

        CategoryDto categoryDto = new CategoryDto(id,name,createdAt);

        boolean b = categoryBo.saveCategory(categoryDto);

        if (b) {
//            req.getSession().setAttribute("registrationStatus", "success");
            resp.sendRedirect("category-save.jsp");
        } else {
//            req.getSession().setAttribute("registrationStatus", "error");
            resp.sendRedirect("AdminDash.jsp");
        }

    }
}
