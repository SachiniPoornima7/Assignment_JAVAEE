package com.example.sachiin.BoLayer.Bo;


import com.example.sachiin.BoLayer.SuperBo;
import com.example.sachiin.dto.CategoryDto;

public interface CategoryBo extends SuperBo {
    boolean saveCategory(CategoryDto categoryDto);

    boolean deleteProducts(String id);

    boolean UpdateCategory(CategoryDto categoryDto);
}
