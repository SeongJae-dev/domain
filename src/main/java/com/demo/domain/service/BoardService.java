package com.demo.domain.service;


import com.demo.domain.dto.PostBoardRequestDto;
import com.demo.domain.entity.BoardEntity;

import java.util.List;

public interface BoardService {

        List<BoardEntity> selectBoardList() throws Exception;

        BoardEntity selectBoardDetail(long id) throws Exception;

        void saveBoard(BoardEntity board) throws Exception;

        //void updateBoard(BoardEntity boardEntity) throws Exception;

        void deleteBoard(long id) throws Exception;
}
