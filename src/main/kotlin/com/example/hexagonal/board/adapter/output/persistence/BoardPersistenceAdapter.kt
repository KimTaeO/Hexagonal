package com.example.hexagonal.board.adapter.output.persistence

import com.example.hexagonal.board.adapter.input.web.request.CreateBoardDto
import com.example.hexagonal.board.adapter.output.persistence.repository.BoardRepository
import com.example.hexagonal.board.application.port.output.CreateBoardPort
import org.springframework.stereotype.Service

@Service
class BoardPersistenceAdapter(
    private val boardRepository: BoardRepository
): CreateBoardPort {
    override fun saveBoard(createBoardDto: CreateBoardDto) {
        boardRepository.save(createBoardDto.toBoardJpaEntity())
    }
}