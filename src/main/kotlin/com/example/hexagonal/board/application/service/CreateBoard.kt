package com.example.hexagonal.board.application.service

import com.example.hexagonal.board.adapter.input.web.request.CreateBoardRequest
import com.example.hexagonal.board.application.port.input.CreateBoardUseCase
import com.example.hexagonal.board.application.port.output.CreateBoardPort
import com.example.hexagonal.board.domain.Board
import org.springframework.stereotype.Service

@Service
class CreateBoard(
    private val createBoardPort: CreateBoardPort
): CreateBoardUseCase {
    override fun createBoard(createBoardRequest: CreateBoardRequest) {
        createBoardPort.saveBoard(createBoardRequest)
    }
}