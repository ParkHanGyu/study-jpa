package com.example.board.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private Long id;
    private String email;
    private String nickname;
    private String name; // 회원 이름 필드 추가
    private String registerDate;
    private String authority;

}
