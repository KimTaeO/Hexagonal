package com.example.hexagonal.board.adapter.input.web

import com.example.hexagonal.board.adapter.input.web.request.CreateBoardRequest
import com.example.hexagonal.board.application.port.input.CreateBoardUseCase
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/board")
class BoardController(
    private val createBoardUseCase: CreateBoardUseCase
) {
    @PostMapping
    fun createBoard(@RequestBody createBoardRequest: CreateBoardRequest): ResponseEntity<Void> {
        createBoardUseCase.createBoard(createBoardRequest)
        return ResponseEntity(HttpStatus.CREATED)
    }
}