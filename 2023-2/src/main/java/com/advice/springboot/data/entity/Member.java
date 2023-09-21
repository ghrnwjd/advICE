package com.advice.springboot.data.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Member {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      @Column(name = "MEMBER_ID")
      private int id;

      @Column(nullable = false)
      private String membername;

      @Column(nullable = false)
      private String memberNumber;

      @Column(nullable = false)
      private String password;

      @Column
      private int account;

      @OneToMany(mappedBy = "member")
      List<Board> boardList = new ArrayList<>();

}
