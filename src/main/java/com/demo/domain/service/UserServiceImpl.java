package com.demo.domain.service;

import com.demo.domain.entity.UserEntity;
import com.demo.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements  UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public List<UserEntity> selectUserList() throws Exception {
        return userRepository.findAll();
    }

    @Override
    public UserEntity selectUserDetail(long id) throws Exception {
        Optional<UserEntity> optiona = userRepository.findById(id);
        if(optiona.isPresent()){
            UserEntity userEntity = optiona.get();
            return userEntity;
        }else {
            throw new NullPointerException();
        }
    }

//    @Override
//    public UserEntity getUserBoard(long id) throws Exception {
//        userRepository.f
//        return null;
//    }

    @Override
    public void saveUser(UserEntity userEntity) throws Exception {
        userRepository.save(userEntity);
    }

    @Override
    public void deleteUser(UserEntity userEntity) throws Exception {
        Optional<UserEntity> optional= userRepository.findById(userEntity.getId());
//        if(checkUser.equals(userEntity.getId()) && checkUser.equals(userEntity.getUserId()) && checkUser.equals(userEntity.getPassword()))
        if (optional.isPresent())
        {
            UserEntity checkuser = optional.get();
            if(checkuser.getId()==userEntity.getId() && checkuser.getUserId().equals(userEntity.getUserId()) && checkuser.getPassword().equals(userEntity.getPassword()))
            {
                userRepository.deleteById(userEntity.getId());
            }
        }

    }
}
