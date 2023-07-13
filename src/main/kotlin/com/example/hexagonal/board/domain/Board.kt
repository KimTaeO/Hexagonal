package com.example.hexagonal.board.domain

import javax.persistence.*

data class Board (
    val id: Long,
    val title: String,
    val content: String
)