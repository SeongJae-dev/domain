package com.demo.domain.repository;

import com.demo.domain.entity.UserEntity;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.demo.domain.entity.QUserEntity.userEntity;

@Repository
public class UserRepositoryImpl implements UserRepositoryCustom {
    private final JPAQueryFactory queryFactory;

    public UserRepositoryImpl(JPAQueryFactory queryFactory) {
        this.queryFactory = queryFactory;
    }

    @Override
    public List<UserEntity> findByUserId(String userId) {
        return queryFactory.selectFrom(userEntity)
                .where(userEntity.userId.eq(userId))
                .fetch();
    }

//

//    public List<UserEntity> findBy
}
