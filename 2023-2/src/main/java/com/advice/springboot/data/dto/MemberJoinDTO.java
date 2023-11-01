package com.advice.springboot.data.dto;


import com.advice.springboot.data.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberJoinDTO {

      private String membername;
      private String memberNumber;
      private String password;

      public Member toEntity() {

            Member member = new Member();
            member.setMembername(this.getMembername());
            member.setPassword(this.getPassword());
            member.setMemberNumber(this.getMemberNumber());

            return member;
      }

}
