package com.example.hexagonal.board.application.port.input

interface DeleteBoardUseCase {
    fun deleteBoard(id: Long)
}