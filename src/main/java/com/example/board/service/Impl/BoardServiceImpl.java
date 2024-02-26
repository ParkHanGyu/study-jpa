package com.example.board.service.Impl;

import com.example.board.dto.BoardDTO;
import com.example.board.entity.BoardEntity;
import com.example.board.repository.BoardRepository;
import com.example.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    // 마찬가지로 BoardRepository에 있는 메서드를 사용해주기위해 작성.
    // @RequiredArgsConstructor로 생성자 초기화
    private final BoardRepository boardRepository;

//    public void save(BoardDTO boardDTO) {
//        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
//        boardRepository.save(boardEntity);
//
//    }

    @Override
    public void saveBoard(BoardDTO boardDTO) {
        BoardEntity board = new BoardEntity();
        BeanUtils.copyProperties(boardDTO, board);
        boardRepository.save(board);
    }
}