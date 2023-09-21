package com.advice.springboot.data.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Board {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      @Column(name = "BOARD_ID")
      private int id;

      @Column(nullable = false)
      private String title;

      @Lob
      private String content;

      @Column
      private int price;

      @ManyToOne
      @JoinColumn(name = "MEMBER_ID")
      private Member member;

      @Builder
      public Board(String title, String content, int price, Member member) {
            this.title = title;
            this.content = content;
            this.price = price;
            this.member = member;
      }
}
