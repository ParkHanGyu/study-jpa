package com.example.board.entity;

import com.example.board.entity.enumType.ADMIN;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "user_entity_test")
@Getter
@Setter
@NoArgsConstructor
public class User extends BaseEntity {
    @Id
    @Column(name = "user_id")
    private Long id;

    @Column(name = "user_email")  // 수정
    private String email;

    @Column(name = "user_password")  // 수정
    private String password;

    @Column(name = "user_nickname")  // 수정
    private String nickname;

    @Column(name = "user_name")  // 수정
    private String name;

    @Column(name = "user_image_url")  // 수정
    private String imageUrl;

    @Column(name = "user_register_date")  // 수정
    private String registerDate;

    @Enumerated(EnumType.STRING)
    private ADMIN admin = ADMIN.NORMAL;
}
