package com.example.sachiin.BoLayer.BoImpl;


import com.example.sachiin.BoLayer.Bo.ProductsBo;
import com.example.sachiin.DaoLayer.Dao.ProductsDao;
import com.example.sachiin.DaoLayer.DaoFactory;
import com.example.sachiin.DaoLayer.DaoType;
import com.example.sachiin.Entity.Products;
import com.example.sachiin.dto.ProductsDto;

import java.util.ArrayList;
import java.util.List;


public class ProductsBoImpl implements ProductsBo {

    ProductsDao productsDao = (ProductsDao) DaoFactory.getDaoFactory().getDao(DaoType.PRODUCT);
    @Override
    public boolean saveProducts(ProductsDto products) {
        Products products1 = new Products(products.getPid(), products.getName(), products.getQty(), products.getPrice(), products.getImage());
        return productsDao.save(products1);
    }

    @Override
    public boolean deleteProducts(String id) {
       return productsDao.delete(id);
    }

    @Override
    public boolean updateProducts(ProductsDto products) {
        Products products1 = new Products(products.getPid(), products.getName(), products.getQty(), products.getPrice(), products.getImage());
        return productsDao.update(products1);
    }

    @Override
    public List<ProductsDto> getAllProducts() {
        List<Products> all = productsDao.getAll();

        List<ProductsDto> productDtoList = new ArrayList<>();

        for (Products product : all){
            ProductsDto dto = new ProductsDto();
            dto.setPid(product.getPid());
            dto.setName(product.getName());
            dto.setPrice(product.getPrice());
            dto.setQty(product.getQty()); // Assuming `category` is a direct mapping
            dto.setImage(product.getImage()); // Example additional fields
            productDtoList.add(dto); // Add the DTO to the list
        }
        System.out.println("Converting Products to ProductsDto...");
        for (Products product : all) {
            System.out.println("Converting Product ID: " + product.getPid());
        }

        return productDtoList;

    }
}
