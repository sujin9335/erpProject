package com.project.erpsystem.main;

import java.util.ArrayList;

public class UserDao {

	public static UserVo auth; // 로그인 사용자 저장변수 
	
	public static ArrayList<UserVo> list;
	
	static {
		list=new ArrayList<UserVo>();
	}
	
	public static void load(){
		
	}
	
	public static void checkLogin(String id, String pw) {
		
	}
	
	
}
