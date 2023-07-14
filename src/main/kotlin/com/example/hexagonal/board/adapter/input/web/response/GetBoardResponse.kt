package com.example.hexagonal.board.adapter.input.web.response

data class GetBoardResponse(
    val id: Long,
    val title: String,
    val content: String
)