// jpa관련 시간 정보를 다를 수 있도록
package com.example.board.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
public class BaseEntity {
    // 
    @CreationTimestamp // 생성 됬을때 시간 정보를 만들어주는 부분
    @Column(updatable = false) // update할때는 관여 x
    private LocalDateTime createdTime;

    @UpdateTimestamp // 업데이트 됬을때 시간 정보를 만들어주는 부분
    @Column(insertable = false) // inser할때는 관여x
    private LocalDateTime updatedTime;
}