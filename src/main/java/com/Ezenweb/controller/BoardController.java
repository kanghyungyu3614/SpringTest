package com.Ezenweb.controller;

import com.Ezenweb.domain.dto.BoardDto;
import com.Ezenweb.service.BoardService;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class BoardController {

    @GetMapping("/") // http://localhost:8080 ->  도메인[]구매시 www.ezenweb.com
    public Resource board() {
        return new ClassPathResource("templates/index.html");
    }
    // -------------------------------- HTML LOAD URL ------------------------

    // -------------------------------- 기능처리 ------------------------
    // 1. 게시물 쓰기 처리 [ 첨부파일 ]
    @GetMapping("/submit")
    public boolean setboard(@RequestBody BoardDto boardDto){

        // 1. DTO 내용 확인
        System.out.println(boardDto.toString());
        // 2. -------------> 서비스[ 비즈니스 로직 ] 로 이동
        boolean result = new BoardService().setboard(boardDto);
        // 3. 반환
        return true; // response
        // boolean : Content-Type: application/json;
        // String : Content-Type: text/html; charset=UTF-8
        // Resource : Content-Type: text/html;
    }
    // 2. 게시물 목록 보기 처리 [ 페이지, 검색 ]
    @GetMapping("/getboards")
    @ResponseBody // 생략가능
    public ArrayList<BoardDto> getboards() {
        // 1. 서비스 [ 비즈니스 로직 ] 로 이동
        ArrayList<BoardDto> list = new BoardService().getboards();
        // 2. 반환
        return list;
    }
}