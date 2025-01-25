package com.example.sachiin.DaoLayer;

import java.util.List;

public interface CrudDao <T> extends SuperDao{
    boolean save(T user1);

    boolean Login(String email, String password);

    boolean delete(String id);

    boolean update(T t);

    List<T> getAll();
}
