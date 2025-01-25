package com.example.sachiin.servelet.product;

import com.example.sachiin.BoLayer.Bo.ProductsBo;
import com.example.sachiin.BoLayer.BoFactory;
import com.example.sachiin.BoLayer.BoType;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;


@WebServlet(name =  "ProductsDeleteServelet" , value = "/products-delete")
public class ProductsDeleteServelet extends HttpServlet {

    ProductsBo productsBo = (ProductsBo) BoFactory.getBoFactory().getBo(BoType.PRODUCT);
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String id = req.getParameter("id");

        boolean b = productsBo.deleteProducts(id);

        if (b) {
//            req.getSession().setAttribute("registrationStatus", "success");
            resp.sendRedirect("products-delete.jsp");
        } else {
//            req.getSession().setAttribute("registrationStatus", "error");
            resp.sendRedirect("AdminDash.jsp");
        }


    }
}
