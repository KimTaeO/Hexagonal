package com.example.hexagonal.board.application.service

import com.example.hexagonal.board.application.port.input.DeleteBoardUseCase
import com.example.hexagonal.board.application.port.output.DeleteBoardPort
import org.springframework.stereotype.Service

@Service
class DeleteBoard(
    private val deleteBoardPort: DeleteBoardPort
): DeleteBoardUseCase {
    override fun deleteBoard(id: Long) {
        deleteBoardPort.deleteBoard(id)
    }
}