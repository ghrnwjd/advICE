package com.advice.springboot.repository;


import com.advice.springboot.data.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
      Member findByMembername(String membername);
}

