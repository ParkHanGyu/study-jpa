package com.example.board.controller;

import com.example.board.dto.BoardDTO;
//import com.example.board.service.BoardService;
import com.example.board.service.BoardService;
import com.example.board.service.Impl.BoardServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    // @RequiredArgsConstructor로
    // BoardService 필드에 대한 생성자가 자동으로 생성되고 초기화됨
//    private final BoardService boardService;
    //BoardService를 주입해줄 수 있게 된다

    // boardService 인터페이스 초기화
    private final BoardService boardService;

    @GetMapping("/save")
    public String saveForm() {
        return "save";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute BoardDTO boardDTO) {
        boardService.saveBoard(boardDTO);
        return "index";
    }
}
