package com.smhrd.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.domain.Board;
import com.smhrd.mapper.BoardMapper;

@RestController // ajax 요청을 전담으로 처리할 컨트롤러 ==> @ResponseBody 빼도댐
public class boardRestCon {
	
	@Autowired
	BoardMapper Mapper;

	@RequestMapping("/boardList.do") // 요청(url)이 들어왔을때 매서드를 실행하기 위한 매핑
	public List<Board> boardList() {
		
		List<Board> list = Mapper.boardList() ;
		
		// jackson databind 라이브러리땜에 자동으로 일케 댐
		return list; 
	}
	
	@RequestMapping("/viewUpdate.do")
	public void viewUpdate(Board vo){

		Mapper.viewUpdate(vo);

	}
	
	
}
