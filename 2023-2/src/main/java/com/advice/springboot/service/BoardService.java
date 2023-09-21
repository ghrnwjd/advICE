package com.advice.springboot.service;

import com.advice.springboot.data.dto.BoardDto;
import com.advice.springboot.data.dto.BoardResDto;
import com.advice.springboot.data.entity.Board;
import com.advice.springboot.data.entity.Member;
import com.advice.springboot.repository.BoardRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class BoardService {

      private final BoardRepository boardRepository;
      private final MemberService memberService;

      public BoardService(BoardRepository boardRepository, MemberService memberService) {
            this.boardRepository = boardRepository;
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
}
