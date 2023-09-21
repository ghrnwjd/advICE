package com.advice.springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.advice.springboot.data.entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {

}
