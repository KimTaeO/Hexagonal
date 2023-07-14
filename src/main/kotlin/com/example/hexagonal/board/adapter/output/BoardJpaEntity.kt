package com.example.hexagonal.board.adapter.output

import com.example.hexagonal.board.domain.Board
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class BoardJpaEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L,

    val title: String,

    val content: String
) {
    fun toDomain(): Board =
        Board(
            id = this.id,
            title = this.title,
            content = this.content
        )
}