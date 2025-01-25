package com.example.sachiin.BoLayer.BoImpl;


import com.example.sachiin.BoLayer.Bo.UserBo;
import com.example.sachiin.DaoLayer.Dao.UserDao;
import com.example.sachiin.DaoLayer.DaoFactory;
import com.example.sachiin.DaoLayer.DaoType;
import com.example.sachiin.Entity.User;
import com.example.sachiin.dto.UserDto;

public class UserBoImpl implements UserBo {


    UserDao userDao = (UserDao) DaoFactory.getDaoFactory().getDao(DaoType.USER);

    @Override
    public boolean SaveUsers(UserDto user) {
        User user1 = new User(user.getUserId(), user.getUserName(), user.getEmail(), user.getPassword(), user.isActive(), user.getRole(), user.getCreatedAt());
        return userDao.save(user1);
    }

    @Override
    public boolean LoginDateails(String email, String password) {
       return userDao.Login(email,password);
    }

    @Override
    public String getUserRole(String email) {
       return userDao.getUserRole(email);
    }
}
