package com.demo.domain.service;


import com.demo.domain.dto.PostBoardRequestDto;
import com.demo.domain.entity.BoardEntity;

import java.util.List;

public interface BoardService {

        List<BoardEntity> selectBoardList() throws Exception;

        BoardEntity selectBoardDetail(int id) throws Exception;

        void saveBoard(BoardEntity board) throws Exception;

        //void updateBoard(BoardEntity boardEntity) throws Exception;

        void deleteBoard(int id) throws Exception;
}
