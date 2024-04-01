package com.example.board.controller;

import com.example.board.dto.response.user.GetUserListResponse;
import com.example.board.entity.User;
import com.example.board.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    private UserService userService;

//    @GetMapping("/api/users")
//    public List<User> getAllUsers() {
//        System.out.println("컨트롤에서 보내는 데이터" + userService.getAllUsers());
//        return userService.getAllUsers();
//    }

    @GetMapping("/get-login-user") // 로그인을 한 경우 회원 정보 클라이언트로 넘겨주기.
    public ResponseEntity<? super GetUserListResponse> getLoginUser(){
        return userService.getAllUsers();
    }
}