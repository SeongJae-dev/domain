package com.demo.domain.repository;

import com.demo.domain.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<UserEntity,Long>, UserRepositoryCustom {
    List<UserEntity> findAll();

//    void deleteByIdAndUserIdAndPassword(UserEntity userEntity);
}
