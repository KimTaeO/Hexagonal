package com.example.hexagonal.board.application.converter

import com.example.hexagonal.board.adapter.output.BoardJpaEntity
import com.example.hexagonal.board.domain.Board

interface BoardConverter {
    fun toDomain(boardJpaEntity: BoardJpaEntity): Board
    fun toEntity(board: Board): BoardJpaEntity
}