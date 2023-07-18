package com.example.hexagonal.board.application.service

import com.example.hexagonal.board.adapter.input.web.request.UpdateBoardRequest
import com.example.hexagonal.board.application.converter.BoardConverter
import com.example.hexagonal.board.application.port.input.UpdateBoardUseCase
import com.example.hexagonal.board.application.port.output.CreateBoardPort
import com.example.hexagonal.board.application.port.output.GetBoardPort
import org.springframework.stereotype.Service

@Service
class UpdateBoard(
    private val getBoardPort: GetBoardPort,
    private val createBoardPort: CreateBoardPort,
    private val boardConverter: BoardConverter
): UpdateBoardUseCase {
    override fun updateBoard(id: Long, updateBoardRequest: UpdateBoardRequest) {
        val entity = getBoardPort.getBoard(id)
                ?: throw Exception()

        val domain = boardConverter.toDomain(entity)

        createBoardPort.saveBoard(domain.copy(title = updateBoardRequest.title, content = updateBoardRequest.content))
    }
}