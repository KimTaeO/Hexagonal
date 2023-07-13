package com.example.hexagonal.board.adapter.output.persistence.repository

import com.example.hexagonal.board.domain.Board
import org.springframework.data.jpa.repository.JpaRepository

interface BoardRepository: JpaRepository<Board, Long> {
}