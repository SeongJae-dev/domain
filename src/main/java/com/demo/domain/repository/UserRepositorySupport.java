package com.demo.domain.repository;

import com.demo.domain.entity.QUserEntity;
import com.demo.domain.entity.UserEntity;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.demo.domain.entity.QUserEntity.userEntity;

@Repository
public class UserRepositorySupport extends QuerydslRepositorySupport {
    private final JPAQueryFactory queryFactory;
    public UserRepositorySupport(JPAQueryFactory queryFactory) {
        super(UserEntity.class);
        this.queryFactory = queryFactory;
    }

    public List<UserEntity> findById(long id){
        return queryFactory
                .selectFrom(userEntity)
                .where(userEntity.id.eq(id))
                .fetch();
    }

//    public List<UserEntity> findBy
}
