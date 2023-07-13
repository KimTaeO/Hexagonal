package com.example.hexagonal.board.application.port.output

import com.example.hexagonal.board.adapter.input.web.request.CreateBoardDto


interface CreateBoardPort {
    fun saveBoard(createBoardDto: CreateBoardDto)
}