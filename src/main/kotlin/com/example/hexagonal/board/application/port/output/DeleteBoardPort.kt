package com.example.hexagonal.board.application.port.output

interface DeleteBoardPort {
    fun deleteBoard(id: Long)
}