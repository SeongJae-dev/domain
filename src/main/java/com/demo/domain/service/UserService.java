package com.demo.domain.service;

import com.demo.domain.entity.UserEntity;

import java.util.List;

public interface UserService {

    List<UserEntity> selectUserList() throws Exception;

    UserEntity selectUserDetail(long id) throws  Exception;

//    UserEntity getUserBoard(long id) throws  Exception;

    void saveUser(UserEntity userEntity) throws  Exception;

    void deleteUser(UserEntity userEntity) throws  Exception;




}
