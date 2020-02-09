package com.demo.domain.repository;

import com.demo.domain.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepositoryCustom {
    List<UserEntity> findByUserId(String userId);
//    void deleteByIdAndUserIdAndPassword(UserEntity userEntity);
}
