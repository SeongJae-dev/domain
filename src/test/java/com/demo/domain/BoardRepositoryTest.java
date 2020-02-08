package com.demo.domain;


import com.demo.domain.repository.BoardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardRepositoryTest {

    @Autowired
    BoardRepository boardRepository;


    @Test
    public void saveTest(){

        //boardRepository.save()
    }

}
