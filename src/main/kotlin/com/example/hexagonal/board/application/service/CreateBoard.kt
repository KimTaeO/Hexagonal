package com.example.hexagonal.board.application.service

import com.example.hexagonal.board.adapter.input.web.request.CreateBoardDto
import com.example.hexagonal.board.application.port.input.CreateBoardUseCase
import com.example.hexagonal.board.application.port.output.CreateBoardPort
import org.springframework.stereotype.Service

@Service
class CreateBoard(
    private val createBoardPort: CreateBoardPort
): CreateBoardUseCase {
    override fun createBoard(createBoardDto: CreateBoardDto) {
        createBoardPort.saveBoard(createBoardDto)
    }
}