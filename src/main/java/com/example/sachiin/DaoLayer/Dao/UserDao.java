package com.example.sachiin.DaoLayer.Dao;


import com.example.sachiin.DaoLayer.CrudDao;
import com.example.sachiin.Entity.User;

public interface UserDao extends CrudDao<User> {
    String getUserRole(String email);
}
