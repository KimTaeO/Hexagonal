package com.example.hexagonal.board.adapter.output.persistence

import com.example.hexagonal.board.adapter.output.BoardJpaEntity
import com.example.hexagonal.board.adapter.output.persistence.repository.BoardRepository
import com.example.hexagonal.board.application.port.output.CreateBoardPort
import com.example.hexagonal.board.application.port.output.DeleteBoardPort
import com.example.hexagonal.board.application.port.output.GetBoardPort
import com.example.hexagonal.board.domain.Board
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class BoardPersistenceAdapter(
    private val boardRepository: BoardRepository
): CreateBoardPort, GetBoardPort, DeleteBoardPort {
    override fun saveBoard(board: Board) {
        boardRepository.save(board.toEntity())
    }

    override fun getBoard(id: Long): BoardJpaEntity? =
        boardRepository.findByIdOrNull(id)

    override fun deleteBoard(id: Long) {
        boardRepository.deleteById(id)
    }
}