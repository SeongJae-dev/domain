package com.demo.domain.controller;

import com.demo.domain.dto.PostBoardRequestDto;
import com.demo.domain.entity.BoardEntity;
import com.demo.domain.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<BoardEntity> BoardList(Map param) throws Exception{
        return  boardService.selectBoardList();
    }

    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    public BoardEntity BoardInfo(@PathVariable("id") int id) throws Exception{
        return boardService.selectBoardDetail(id);
    }

    @RequestMapping(value = "/save")
    public void saveBoard(@RequestBody BoardEntity board) throws Exception{
//        board.setContent("TestJpa_centent");
//        board.setTitle("TestJpa_Title");
//        board.setCreateId("TestJpa_Tester");
        boardService.saveBoard(board);
    }

    @RequestMapping(value = "/save/{id}")
    public void updateBoard(@RequestBody BoardEntity board, @PathVariable("id") int id) throws Exception{
//        PostBoardRequestDto postBoardRequestDto = new PostBoardRequestDto();
        board.setId(id);
        boardService.saveBoard(board);
    }

    @RequestMapping(value = "/delete/{id}")
    public void deleteBoard(@PathVariable("id") int id) throws  Exception{
        boardService.deleteBoard(id);
    }
}
