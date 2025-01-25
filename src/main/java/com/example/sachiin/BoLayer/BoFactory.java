package com.example.sachiin.BoLayer;


import com.example.sachiin.BoLayer.BoImpl.CategoryBoImpl;
import com.example.sachiin.BoLayer.BoImpl.ProductsBoImpl;
import com.example.sachiin.BoLayer.BoImpl.UserBoImpl;

public class BoFactory {

    private static BoFactory boFactory;

    public BoFactory(){

    }

    public static BoFactory getBoFactory(){
           if (boFactory == null){
               boFactory = new BoFactory();
           }
           return boFactory;
    }

    public SuperBo getBo(BoType boType) {

        switch (boType){
            case USER:
                return new UserBoImpl();
            case PRODUCT:
                return new ProductsBoImpl();
            case CATEGORY:
                return new CategoryBoImpl();

            default:
                return null;

        }
    }
}
