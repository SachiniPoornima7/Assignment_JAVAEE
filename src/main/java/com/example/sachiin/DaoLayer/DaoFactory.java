package com.example.sachiin.DaoLayer;


import com.example.sachiin.DaoLayer.DaoImpl.CategoryDaoImpl;
import com.example.sachiin.DaoLayer.DaoImpl.ProductsDaoImpl;
import com.example.sachiin.DaoLayer.DaoImpl.UserDaoImpl;

public class DaoFactory {

    private static DaoFactory daoFactory;

    public DaoFactory(){

    }

    public static DaoFactory getDaoFactory(){
        if (daoFactory == null){
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDao getDao(DaoType daoType){
        switch (daoType){
            case USER:
                return new UserDaoImpl();
            case PRODUCT:
                return new ProductsDaoImpl();
            case CATEGORY:
                return  new CategoryDaoImpl();
            default:
                return null;
        }
    }


}
