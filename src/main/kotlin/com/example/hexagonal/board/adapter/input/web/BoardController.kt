package com.example.hexagonal.board.adapter.input.web

import com.example.hexagonal.board.adapter.input.web.request.CreateBoardRequest
import com.example.hexagonal.board.adapter.input.web.request.UpdateBoardRequest
import com.example.hexagonal.board.adapter.input.web.response.GetBoardResponse
import com.example.hexagonal.board.application.port.input.CreateBoardUseCase
import com.example.hexagonal.board.application.port.input.DeleteBoardUseCase
import com.example.hexagonal.board.application.port.input.GetBoardUseCase
import com.example.hexagonal.board.application.port.input.UpdateBoardUseCase
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/board")
class BoardController(
    private val createBoardUseCase: CreateBoardUseCase,
    private val getBoardUseCase: GetBoardUseCase,
    private val updateBoardUseCase: UpdateBoardUseCase,
    private val deleteBoardUseCase: DeleteBoardUseCase
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

    @PatchMapping("/{board_id}")
    fun updateBoard(@PathVariable("board_id") boardId: Long, @RequestBody updateBoardRequest: UpdateBoardRequest): ResponseEntity<Void> {
        updateBoardUseCase.updateBoard(boardId, updateBoardRequest)
        return ResponseEntity(HttpStatus.NO_CONTENT)
    }

    @DeleteMapping("/{board_id}")
    fun updateBoard(@PathVariable("board_id") boardId: Long): ResponseEntity<Void> {
        deleteBoardUseCase.deleteBoard(boardId)
        return ResponseEntity(HttpStatus.NO_CONTENT)
    }
}