package com.example.sachiin.BoLayer.Bo;


import com.example.sachiin.BoLayer.SuperBo;
import com.example.sachiin.dto.UserDto;

public interface UserBo extends SuperBo {
    boolean SaveUsers(UserDto user);

    boolean LoginDateails(String email, String password);

    public String getUserRole(String email);

}
