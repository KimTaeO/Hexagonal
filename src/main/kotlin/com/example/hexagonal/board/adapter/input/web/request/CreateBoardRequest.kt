package com.example.hexagonal.board.adapter.input.web.request

import com.example.hexagonal.board.domain.Board

class CreateBoardRequest(
    val title: String,
    val content: String
) {
    fun toDomain(): Board =
        Board(
            title = this.title,
            content = this.content
        )
}
