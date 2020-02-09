package com.demo.domain;


import com.demo.domain.entity.BoardEntity;
import com.demo.domain.entity.UserEntity;
import com.demo.domain.repository.BoardRepository;
import com.demo.domain.repository.UserRepository;
import com.demo.domain.repository.UserRepositorySupport;
import com.demo.domain.service.BoardService;
import com.demo.domain.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

import static com.mysema.commons.lang.Assert.assertThat;
import static com.mysema.commons.lang.Assert.isFalse;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;


@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserRepositorySupport userRepositorySupport;

    @Autowired
    UserService userService;

    @Test
    public void saveTest() throws Exception {
        userService.saveUser(UserEntity.builder()
                .userId("tester")
                .password("123123")
                .userName("유저생성")
                .email("chiron8963@gmail.com")
                .dateOfBirth("1992-12-17")
                .build());
    }


    @Test
    public void getUserListTest(){
        userRepository.findAll();
    }

    @Test
    public void getBoardDetail() throws Exception {
//        long id = 1;
//        userRepository.findById(id);
//        userService.selectUserDetail(id);
//        userRepository.fi
    }

    //QueryDsl TEST
    @Test
    public void queryDslTEST(){
//        System.out.println(jun);
        long id = 1;
        String userid="tester";
//        List<UserEntity> list = userRepositorySupport.findById(id);
        List<UserEntity> list = userRepository.findByUserId(userid);
//        assertThat(list.size(),is(1));
//        assertThat(list.size(),is(1));
//        assertThat(list.get(0).getUserId(),is(userid));
    }
}
