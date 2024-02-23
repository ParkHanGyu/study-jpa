package com.example.board.repository;

import com.example.board.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
// <엔티티 클래스의 이름, 엔티티 클래스가 가지고 있는 pk(@ID)의 타입>
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
