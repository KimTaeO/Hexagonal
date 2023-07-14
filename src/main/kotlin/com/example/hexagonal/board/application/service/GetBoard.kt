package com.example.hexagonal.board.application.service

import com.example.hexagonal.board.adapter.input.web.response.GetBoardResponse
import com.example.hexagonal.board.application.port.input.GetBoardUseCase
import com.example.hexagonal.board.application.port.output.GetBoardPort
import com.example.hexagonal.board.domain.Board
import org.springframework.stereotype.Service

@Service
class GetBoard(
    private val getBoardPort: GetBoardPort
): GetBoardUseCase {
    override fun getBoard(id: Long): GetBoardResponse {
        val board = getBoardPort.getBoard(id) ?: throw Exception()
        return GetBoardResponse(
            id = board.id,
            title = board.title,
            content = board.content
        )
    }

}