package com.demo.domain.controller;


import com.demo.domain.entity.UserEntity;
import com.demo.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/list")
    public List<UserEntity> UserList() throws  Exception{
        return userService.selectUserList();
    }

    @RequestMapping(value = "/info/{id}",method = RequestMethod.GET)
    public UserEntity UserInfo(@PathVariable("id") long id) throws Exception{
        return userService.selectUserDetail(id);
    }

    public void CreateUser(@RequestBody UserEntity userEntity) throws  Exception{
        userService.saveUser(userEntity);
    }

    public void UpdateUserInfo(@RequestBody UserEntity userEntity, @PathVariable("id") long id) throws  Exception{
        userEntity.setId(id);
        userService.saveUser(userEntity);
    }
}
