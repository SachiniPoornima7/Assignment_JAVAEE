package com.example.sachiin.servelet.product;

import com.example.sachiin.BoLayer.Bo.ProductsBo;
import com.example.sachiin.BoLayer.BoFactory;
import com.example.sachiin.BoLayer.BoType;
import com.example.sachiin.dto.ProductsDto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Base64;


@WebServlet(name = "ProductsUpdateServlet" , value = "/products-update")

public class ProductsUpdateServlet extends HttpServlet {


    ProductsBo productsBo = (ProductsBo) BoFactory.getBoFactory().getBo(BoType.PRODUCT);
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String price = req.getParameter("price");
        String qty = req.getParameter("qty");
        String imageString = req.getParameter("productImage");
        byte[] imageBytes = null;

        if (imageString != null && !imageString.isEmpty()) {
            imageBytes = Base64.getDecoder().decode(imageString);
        }

        ProductsDto products = new ProductsDto(id, name, qty, price, imageBytes);

        boolean b = productsBo.updateProducts(products);

        if (b) {
//            req.getSession().setAttribute("registrationStatus", "success");
            resp.sendRedirect("products-update.jsp");
        } else {
//            req.getSession().setAttribute("registrationStatus", "error");
            resp.sendRedirect("AdminDash.jsp");
        }
    }
}
