package com.advice.springboot.data.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class ProductBuyDto {

      private String cellerName;
      private String price;
      private String consumerName;

}
