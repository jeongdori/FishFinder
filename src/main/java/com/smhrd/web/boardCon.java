package com.smhrd.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smhrd.domain.Board;
import com.smhrd.mapper.BoardMapper;

@Controller //어노테이션,, 이 파일이 POJO라는것을 알 수 있도록 지정
public class boardCon {

	// DI(dependency injection), 의존성 작업
	@Autowired // 메모리에 있는 객체 넣기
	BoardMapper Mapper;
	
	@RequestMapping("/")
	public String base() {
		
		return "base";
	}
	
	
	


	
}
