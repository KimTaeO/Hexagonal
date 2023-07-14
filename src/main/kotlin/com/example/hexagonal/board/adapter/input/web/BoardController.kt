package com.example.hexagonal.board.adapter.input.web

import com.example.hexagonal.board.adapter.input.web.request.CreateBoardRequest
import com.example.hexagonal.board.adapter.input.web.response.GetBoardResponse
import com.example.hexagonal.board.application.port.input.CreateBoardUseCase
import com.example.hexagonal.board.application.port.input.GetBoardUseCase
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/board")
class BoardController(
    private val createBoardUseCase: CreateBoardUseCase,
    private val getBoardUseCase: GetBoardUseCase
) {
    @PostMapping
    fun createBoard(@RequestBody createBoardRequest: CreateBoardRequest): ResponseEntity<Void> {
        createBoardUseCase.createBoard(createBoardRequest)
        return ResponseEntity(HttpStatus.CREATED)
    }

    @GetMapping("/{board_id}")
    fun getBoard(@PathVariable("board_id") boardId: Long): ResponseEntity<GetBoardResponse> {
        val result = getBoardUseCase.getBoard(boardId)
        return ResponseEntity.ok().body(result)
    }
}