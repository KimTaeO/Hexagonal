package com.example.hexagonal.board.application.port.input

import com.example.hexagonal.board.adapter.input.web.request.CreateBoardDto

interface CreateBoardUseCase {
    fun createBoard(createBoardDto: CreateBoardDto)
}