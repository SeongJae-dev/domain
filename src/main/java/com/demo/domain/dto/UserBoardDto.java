//package com.demo.domain.dto;
//
//
//import com.demo.domain.entity.BoardEntity;
//import com.demo.domain.entity.UserEntity;
//import com.querydsl.core.types.Projections;
//import com.querydsl.jpa.impl.JPAQueryFactory;
//import lombok.AllArgsConstructor;
//import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Properties;
//
//import static com.demo.domain.entity.QUserEntity.userEntity;
//
//@AllArgsConstructor
//public class UserBoardDto  {
//    private final JPAQueryFactory queryFactory;
//
//    private String createName;
//    private List<BoardEntity> board = new ArrayList<>();
//
//    public UserBoardDto(JPAQueryFactory queryFactory) {
////        super(UserEntity.class);
//        this.queryFactory = queryFactory;
//    }
//
//
//    public List<BoardEntity>  findUserBoard(){
//        List<UserEntity> userBoards= queryFactory
//                .selectFrom(userEntity)
//                .leftJoin(userEntity.id, board).fetchJoin()
//                .fetch();
//
//        return userBoards.stream().map(b -> new UserBoardDto(b.g))
//    }
//
//}
