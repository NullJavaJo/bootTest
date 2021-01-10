package com.myboot02.domain;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

//@Entitiy
//@AllArgsConstructor
@Data
//@Builder
//@Value //한 번 생성하면 변경할 수 없는 불변 객체를 만들기 위한 클래스를 선언할 때 사용
public class User implements Serializable {

	//@NonNull
	private String userName;//사용자 이름
	private String userId;//사용자 아이디 : 중복불가
	private String password;//사용자 비밀번호
	private String nickname;//사용자 닉네임 : 중복가능
	private String email;//이메일 : 본인인증을 위한 수단
	private String certificationNo;//인증번호
	private String role;//사용자권한부여
	private Date withdrawalDate;//탈퇴일
	private boolean withdrawalStatus;//탈퇴상태
	private String withdrawalReason;//탈퇴사유
	private int blindCount;//블라인드처리된 게시물 수
	private Date shareLimit;//공유제한일
	private boolean timeDisplay;//레이아웃 설정
	private boolean weatherDisplay;//레이아웃 설정
	private boolean locationDisplay;//레이아웃 설정

	public User(String userId, String userName, String password, String nickname, String email, String certificationNo) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.nickname = nickname;
		this.email = email;
		this.certificationNo = certificationNo;
	}

//	public User(String userId, String password) {
//		this.userId = userId;
//		this.password = password;
//	}
}
