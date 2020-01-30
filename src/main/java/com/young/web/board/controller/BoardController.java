package com.young.web.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@RequestMapping(value="/list")
	public String getBoardList() {
		
		return "/board/boardList";
	}

}
