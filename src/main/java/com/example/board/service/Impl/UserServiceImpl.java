package com.example.board.service.Impl;

import com.example.board.entity.User;
import com.example.board.repository.UserRepository;
import com.example.board.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        System.out.println("UserServiceImpl getAllUsers() 보내는 값 : " + userRepository.findAll());
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, User user) {
        User existingUser = userRepository.findById(id).orElse(null);
        if (existingUser != null) {
            existingUser.setEmail(user.getEmail());
            existingUser.setNickname(user.getNickname());
            existingUser.setName(user.getName());
            existingUser.setPassword(user.getPassword());
            existingUser.setImageUrl(user.getImageUrl());
            existingUser.setAdmin(user.getAdmin());
            existingUser.setRegisterDate(user.getRegisterDate());
            return userRepository.save(existingUser);
        }
        return null;
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}