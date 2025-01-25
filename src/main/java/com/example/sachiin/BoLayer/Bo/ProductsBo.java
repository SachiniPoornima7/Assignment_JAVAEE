package com.example.sachiin.BoLayer.Bo;


import com.example.sachiin.BoLayer.SuperBo;
import com.example.sachiin.dto.ProductsDto;

import java.util.List;


public interface ProductsBo extends SuperBo {
    boolean saveProducts(ProductsDto products);

    boolean deleteProducts(String id);

    boolean updateProducts(ProductsDto products);

    List<ProductsDto> getAllProducts();

}
