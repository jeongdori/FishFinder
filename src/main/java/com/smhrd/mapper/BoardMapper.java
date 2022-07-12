package com.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;

import com.smhrd.domain.Board;

public interface BoardMapper {

	public List<Board> boardList();
	
	public int boardInsert(Board vo);
	
	public Board boardContent(int idx);
	
	// 어노테이션을 통해 sql문 작성
	@Delete("delete from board where idx=#{idx}")
	public int boardDelete(int idx);
	
	public int boardUpdate(Board vo);

	public int viewUpdate(Board vo);
}
