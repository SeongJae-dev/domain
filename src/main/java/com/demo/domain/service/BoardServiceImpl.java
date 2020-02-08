package com.demo.domain.service;

import com.demo.domain.entity.BoardEntity;
import com.demo.domain.repository.BoardRepository;
import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.LogManager;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardRepository boardRepository;

    @Override
    public List<BoardEntity> selectBoardList() throws Exception {
        return boardRepository.findAll();
    }

    @Override
    public BoardEntity selectBoardDetail(int id) throws Exception {
//        Optional<BoardEntity> optional = boardRepository.findById(id);
        Optional<BoardEntity> optional = boardRepository.findById(id);
        if (optional.isPresent()) {
            BoardEntity boardEntity = optional.get();
            boardEntity.builder().hitcnt(boardEntity.getHitcnt()+1);
            return boardEntity;
        } else {
            throw new NullPointerException();
        }
    }

    @Override
    public void saveBoard(BoardEntity board) throws Exception {
        System.out.println("board log");
        board.getContent();
        board.getCreateId();
        board.getTitle();
        board.getCreateId();
        board.getCreateDateTime();
        board.getHitcnt();
        System.out.println("====================");
        boardRepository.save(board);
    }


    @Override
    public void deleteBoard(int id) {
        boardRepository.deleteById(id);
    }
}
