package com.example.hexagonal.board.application.port.output

import com.example.hexagonal.board.domain.Board

interface GetBoardPort {
    fun getBoard(id: Long): Board?
}