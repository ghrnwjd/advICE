package com.advice.springboot.controller;


import com.advice.springboot.data.dto.BoardDto;
import com.advice.springboot.service.BoardService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiController {


      private BoardService boardService;

      public apiController(BoardService boardService) {
            this.boardService = boardService;
      }


      @PostMapping("/board/new")
      public void 글쓰기(@RequestBody BoardDto boardDto) {
            boardService.글쓰기(boardDto);
      }


}
