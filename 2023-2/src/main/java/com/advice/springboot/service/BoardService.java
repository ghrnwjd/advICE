package com.advice.springboot.service;

import com.advice.springboot.data.dto.BoardDto;
import com.advice.springboot.data.dto.BoardResDto;
import com.advice.springboot.data.dto.ProductBuyDto;
import com.advice.springboot.data.entity.Board;
import com.advice.springboot.data.entity.Member;
import com.advice.springboot.repository.BoardRepository;
import com.advice.springboot.repository.MemberRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class BoardService {

      private final BoardRepository boardRepository;
      private final MemberRepository memberRepository;
      private final MemberService memberService;

      public BoardService(BoardRepository boardRepository, MemberRepository memberRepository, MemberService memberService) {
            this.boardRepository = boardRepository;
            this.memberRepository = memberRepository;
            this.memberService = memberService;
      }

      public void 글쓰기(BoardDto boardDto) {
            Member member = memberService.학회원찾기(boardDto.getUsername());

            Board board = Board.builder()
                    .title(boardDto.getTitle())
                    .content(boardDto.getContent())
                    .price(boardDto.getPrice())
                    .member(member)
                    .build();



            boardRepository.save(board);
      }

      public List<BoardResDto> 전체글보기() {

            List<Board> boards = boardRepository.findAll();
            List<BoardResDto> boardResDtos = new ArrayList<>();

            for(Board board : boards) {
                  boardResDtos.add(BoardResDto.builder()
                          .id(board.getId())
                          .title(board.getTitle())
                          .name(board.getMember().getMembername())
                          .build());
            }
            return boardResDtos;
      }

      public Optional<Board> 글보기(String boardId) {
            return boardRepository.findById(Integer.parseInt(boardId));
      }


      @Transactional
      public void 상품구매(ProductBuyDto productBuyDto) {
            String cellerName = productBuyDto.getCellerName();
            String consumerName = productBuyDto.getConsumerName();
            int productPrice = Integer.parseInt(productBuyDto.getPrice());

            Member celler = memberRepository.findByMembername(cellerName);
            Member consumer = memberRepository.findByMembername(consumerName);

            System.out.println("구매 전 판매자 잔고 : " + celler.getAccount());
            System.out.println("구매 전 구매자 잔고 : " + consumer.getAccount());
            celler.setAccount(celler.getAccount() + productPrice);
            consumer.setAccount(consumer.getAccount() - productPrice);

            System.out.println("구매 후 판매자 잔고 : " + celler.getAccount());
            System.out.println("구매 후 구매자 잔고 : " + consumer.getAccount());

      }
}
