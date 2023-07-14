package com.example.hexagonal.board.application.port.output

import com.example.hexagonal.board.adapter.output.BoardJpaEntity

interface GetBoardPort {
    fun getBoard(id: Long): BoardJpaEntity?
}