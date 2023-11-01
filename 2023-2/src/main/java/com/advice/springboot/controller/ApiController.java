package com.advice.springboot.controller;


import com.advice.springboot.data.dto.BoardDto;
<<<<<<< HEAD:2023-2/src/main/java/com/advice/springboot/controller/ApiController.java
import com.advice.springboot.data.dto.ProductBuyDto;
=======
import com.advice.springboot.data.dto.MemberJoinDTO;
import com.advice.springboot.data.entity.Member;
>>>>>>> 11b6341d85c9cba31c5c80163d91cdbc5b12406e:2023-2/src/main/java/com/advice/springboot/controller/apiController.java
import com.advice.springboot.service.BoardService;
import com.advice.springboot.service.MemberService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {


      private BoardService boardService;
      private MemberService memberService;


      public ApiController(BoardService boardService, MemberService memberService) {
            this.boardService = boardService;
            this.memberService = memberService;
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

      @PostMapping("/member/new")
      public String 멤버추가(@RequestBody MemberJoinDTO memberJoinDTO) {
            memberService.멤버추가(memberJoinDTO);
            return  "멤버추가됨";
      }
}
