package com.example.hexagonal.board.adapter.output.persistence

import com.example.hexagonal.board.adapter.input.web.request.CreateBoardRequest
import com.example.hexagonal.board.adapter.output.persistence.repository.BoardRepository
import com.example.hexagonal.board.application.port.output.CreateBoardPort
import com.example.hexagonal.board.domain.Board
import org.springframework.stereotype.Service

@Service
class BoardPersistenceAdapter(
    private val boardRepository: BoardRepository
): CreateBoardPort {
    override fun saveBoard(board: Board) {
        boardRepository.save(board.toEntity())
    }
}