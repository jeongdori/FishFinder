package com.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data //@Data이거 치면 기본 매서드 다 만들어줌 굳
@AllArgsConstructor // 모든 필드 생성자
@NoArgsConstructor // 기본 생성자
@RequiredArgsConstructor //필요한 요소만 가진 생성자
public class Board {

	// 필드명 == 컬럼명
	// 기본생성자는 반드시 있어야함
	
	
	// 글번호, 제목, 작성자, 내용, 작성일, 조회수
	
	private int idx;
	@NonNull
	private String title;
	@NonNull
	private String writer;
	@NonNull
	private String content;
	private String indate;
	private int count;

}
