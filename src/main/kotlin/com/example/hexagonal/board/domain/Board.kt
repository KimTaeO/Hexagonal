package com.example.hexagonal.board.domain

import com.example.hexagonal.board.adapter.output.BoardJpaEntity
import javax.persistence.*

data class Board (
    val id: Long = 0L,
    val title: String,
    val content: String
) {
    fun toEntity(): BoardJpaEntity =
        BoardJpaEntity(
            title = this.title,
            content = this.content
        )
}