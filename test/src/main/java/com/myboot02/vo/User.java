package com.myboot02.vo;

public class User {

	private String userId;
	private String password;
	private String nickName;
	private String email;
	private String language;

	public User() {
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User{" +
				"userId='" + userId + '\'' +
				", password='" + password + '\'' +
				", nickName='" + nickName + '\'' +
				", email='" + email + '\'' +
				", language='" + language + '\'' +
				'}';
	}
}
