package com.demo.domain;


import com.demo.domain.entity.BoardEntity;
import com.demo.domain.repository.BoardRepository;
import com.demo.domain.service.BoardService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardRepositoryTest {

    @Autowired
    BoardRepository boardRepository;

    @Autowired
    BoardService boardService;

    @Test
    public void saveTest() throws Exception {
        boardService.saveBoard(BoardEntity.builder()
        .title("testMethods")
        .content("testMethods")
        .createId("3")
        .build());
    }

    @Test
    public void getBoardListTest(){
        boardRepository.findAll();
    }

    @Test
    public void getBoardDetail(){
        boardRepository.findById(1);
    }

}
