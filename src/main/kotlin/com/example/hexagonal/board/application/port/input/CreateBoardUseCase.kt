package com.example.hexagonal.board.application.port.input

import com.example.hexagonal.board.adapter.input.web.request.CreateBoardRequest

interface CreateBoardUseCase {
    fun createBoard(createBoardRequest: CreateBoardRequest)
}