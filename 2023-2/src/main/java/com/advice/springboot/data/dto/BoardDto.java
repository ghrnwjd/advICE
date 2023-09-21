package com.advice.springboot.data.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BoardDto {

      private String username;
      private String title;
      private String content;
      private int price;


}
