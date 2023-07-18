package com.example.hexagonal.board.application.converter

import com.example.hexagonal.board.adapter.output.BoardJpaEntity
import com.example.hexagonal.board.domain.Board
import org.springframework.stereotype.Component

@Component
class BoardConverterImpl : BoardConverter {
    override fun toDomain(boardJpaEntity: BoardJpaEntity): Board =
        Board(
            id = boardJpaEntity.id,
            title = boardJpaEntity.title,
            content = boardJpaEntity.content
        )

    override fun toEntity(board: Board): BoardJpaEntity =
        BoardJpaEntity(
            id = board.id,
            title = board.title,
            content = board.content
        )
}