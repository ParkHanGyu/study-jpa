package com.example.board.dto.response.user;

import lombok.Getter;
import org.springframework.http.ResponseEntity;

@Getter
public class GetUserListResponse {


    public static ResponseEntity<GetUserListResponse> success() {
        return null;
    }

    public static ResponseEntity<GetUserListResponse> failure() {
        return null;
    }
}
