package com.example.hexagonal.board.adapter.output.persistence

import com.example.hexagonal.board.adapter.input.web.request.CreateBoardRequest
import com.example.hexagonal.board.adapter.output.BoardJpaEntity
import com.example.hexagonal.board.adapter.output.persistence.repository.BoardRepository
import com.example.hexagonal.board.application.port.output.CreateBoardPort
import com.example.hexagonal.board.application.port.output.GetBoardPort
import com.example.hexagonal.board.domain.Board
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class BoardPersistenceAdapter(
    private val boardRepository: BoardRepository
): CreateBoardPort, GetBoardPort {
    override fun saveBoard(createBoardRequest: CreateBoardRequest) {
        boardRepository.save(createBoardRequest.toEntity())
    }

    override fun getBoard(id: Long): Board =
        boardRepository.findByIdOrNull(id)?.toDomain() ?: throw Exception()
}