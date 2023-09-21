package com.advice.springboot.data.dto;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class BoardResDto {
      private int id;
      private String title;
      private String name;

      @Builder
      public BoardResDto(int id, String title, String name) {
            this.id = id;
            this.title = title;
            this.name = name;
      }
}
