package com.example.hexagonal.board.application.port.input

import com.example.hexagonal.board.adapter.input.web.request.UpdateBoardRequest

interface UpdateBoardUseCase {
    fun updateBoard(id: Long, updateBoardRequest: UpdateBoardRequest)
}