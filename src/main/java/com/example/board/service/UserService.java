package com.example.board.service;

import com.example.board.dto.response.user.GetUserListResponse;
import com.example.board.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    ResponseEntity<? super GetUserListResponse> getAllUsers();
    User getUserById(Long id);
    User saveUser(User user);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
}