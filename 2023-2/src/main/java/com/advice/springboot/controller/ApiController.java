package com.advice.springboot.controller;


import com.advice.springboot.data.dto.BoardDto;
import com.advice.springboot.data.dto.ProductBuyDto;
import com.advice.springboot.service.BoardService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {


      private BoardService boardService;

      public ApiController(BoardService boardService) {
            this.boardService = boardService;
      }


      @PostMapping("/board/new")
      public void 글쓰기(@RequestBody BoardDto boardDto) {
            boardService.글쓰기(boardDto);
      }

      @PutMapping("/board/buy")
      public void 상품구매(@RequestBody ProductBuyDto productBuyDto) {
            System.out.println(productBuyDto);
            boardService.상품구매(productBuyDto);
      }

}
