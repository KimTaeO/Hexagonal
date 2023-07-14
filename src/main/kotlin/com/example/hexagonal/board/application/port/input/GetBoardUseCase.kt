package com.example.hexagonal.board.application.port.input

import com.example.hexagonal.board.adapter.input.web.response.GetBoardResponse

interface GetBoardUseCase {
    fun getBoard(id: Long): GetBoardResponse
}