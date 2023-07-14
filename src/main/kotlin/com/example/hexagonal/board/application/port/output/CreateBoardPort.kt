package com.example.hexagonal.board.application.port.output

import com.example.hexagonal.board.domain.Board


interface CreateBoardPort {
    fun saveBoard(board: Board)
}