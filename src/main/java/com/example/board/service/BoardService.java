package com.example.board.service;

import com.example.board.dto.BoardDTO;
import com.example.board.entity.BoardEntity;
import com.example.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// 서비스 클래스에서는 변환해주는 과정들이 많이 발생.
// DTO를 -> Entity클래스로 변환해주는 과정 (Entity 클래스에서 작업을 진행)
// Entity를 -> DTO클래스로 변환해주는 과정 (DTO 클래스에서 작업을 진행)
// 두가지 경우가 있다
// 컨트롤러로부터 넘겨받을때는 DTO로 넘겨받는다
// 그리고 레파지토리로 넘겨줄때는 Entity로 넘겨받는다

// 조회할때는 레파지토리에서 Entity로 넘겨 받는다
// 근데 그거를 컨트롤러로 다시 return해줄때는 DTO로 넘겨준다

// Entity클래스는 Service 클래스 까지만 오도록. 이유는 view에
// 최대한 노출되지 않아야 하기 떄문에

@Service
@RequiredArgsConstructor
public class BoardService {
    // 마찬가지로 BoardRepository에 있는 메서드를 사용해주기위해 작성.
    // @RequiredArgsConstructor로 생성자 초기화
    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO) {
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity);

    }
}
