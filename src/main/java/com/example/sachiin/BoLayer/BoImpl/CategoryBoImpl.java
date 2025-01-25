package com.example.sachiin.BoLayer.BoImpl;

import com.example.sachiin.BoLayer.Bo.CategoryBo;
import com.example.sachiin.DaoLayer.Dao.CategoryDao;
import com.example.sachiin.DaoLayer.DaoFactory;
import com.example.sachiin.DaoLayer.DaoType;
import com.example.sachiin.Entity.Category;
import com.example.sachiin.dto.CategoryDto;



public class CategoryBoImpl implements CategoryBo {

    CategoryDao categoryDao = (CategoryDao) DaoFactory.getDaoFactory().getDao(DaoType.CATEGORY);

    @Override
    public boolean saveCategory(CategoryDto categoryDto) {
        Category category = new Category(categoryDto.getCid(), categoryDto.getCname(), categoryDto.getCreatedAt());
        return categoryDao.save(category);
    }

    @Override
    public boolean deleteProducts(String id) {
       return categoryDao.delete(id);
    }

    @Override
    public boolean UpdateCategory(CategoryDto categoryDto) {
        Category category = new Category(categoryDto.getCid(), categoryDto.getCname(), categoryDto.getCreatedAt());
        return categoryDao.update(category);
    }
}
