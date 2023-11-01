package com.advice.springboot.service;

import com.advice.springboot.data.dto.MemberJoinDTO;
import com.advice.springboot.data.entity.Member;
import com.advice.springboot.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

      private final MemberRepository memberRepository;

      public MemberService(MemberRepository memberRepository) {
            this.memberRepository = memberRepository;
      }


      public void 멤버추가(MemberJoinDTO memberJoinDTO) {
            Member member = memberJoinDTO.toEntity();

            memberRepository.save(member);


      }
      public Member 학회원찾기(String membername) {
            return memberRepository.findByMembername(membername);
      }

}
