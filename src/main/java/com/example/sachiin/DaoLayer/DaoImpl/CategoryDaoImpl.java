package com.example.sachiin.DaoLayer.DaoImpl;

import com.example.sachiin.DaoLayer.Dao.CategoryDao;
import com.example.sachiin.Entity.Category;
import com.example.sachiin.config.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CategoryDaoImpl implements CategoryDao {
    @Override
    public boolean save(Category category) {
        Transaction transaction = null ;
        try {
            Session session = SessionFactoryConfiguration.getInstance().getSession();
            transaction =  session.beginTransaction();
            session.save(category);
            transaction.commit();
            session.close();
            return true;

        }catch (Exception e ){
            e.printStackTrace();
            transaction.rollback();
            return false;
        }
    }

    @Override
    public boolean Login(String email, String password) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        try {

            Session session = SessionFactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();
            Category categery = session.get(Category.class, id);
            session.delete(categery);
            transaction.commit();
            session.close();
            return true;
        }catch (Exception e ){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Category category) {
        Transaction transaction = null;
        try {

            Session session = SessionFactoryConfiguration.getInstance().getSession();
            transaction = session.beginTransaction();
            session.update(category);
            transaction.commit();
            session.close();
            return true;

        }catch (Exception e ){
            transaction.rollback();
            return false;

        }
    }

    @Override
    public List<Category> getAll() {
        return null;
    }
}
