package com.demo.domain.controller;

import com.demo.domain.dto.PostBoardRequestDto;
import com.demo.domain.entity.BoardEntity;
import com.demo.domain.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/api/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<BoardEntity> BoardList() throws Exception{
        return  boardService.selectBoardList();
    }

    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    public BoardEntity BoardInfo(@PathVariable("id") long id) throws Exception{
        return boardService.selectBoardDetail(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void SaveBoard(@RequestBody BoardEntity board) throws Exception{
//        board.setContent("TestJpa_centent");
//        board.setTitle("TestJpa_Title");
//        board.setCreateId("TestJpa_Tester");
        boardService.saveBoard(board);
    }

    @RequestMapping(value = "/save/{id}", method = RequestMethod.PUT)
    public void UpdateBoard(@RequestBody BoardEntity board, @PathVariable("id") long id) throws Exception{
//        PostBoardRequestDto postBoardRequestDto = new PostBoardRequestDto();
        board.setId(id);
        boardService.saveBoard(board);
    }

    //{id} 값을 받을떄는 @PathVariable, ?id=? 일때는RequestParam
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteBoard(@PathVariable("id") long id) throws  Exception{
        boardService.deleteBoard(id);
    }

    @RequestMapping(value = "/delete/all", method = RequestMethod.DELETE)
    public void deleteAll() throws  Exception{
        boardService.deleteAll();
    }
}
