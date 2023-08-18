package com.project.erpsystem.main;

import java.util.Scanner;

public class InitialView {

	public static void erpStart() {
		
		Scanner scan = new Scanner(System.in);
		
		boolean loop=true;
		
		while(loop){
			System.out.println("안녕하세요, ㈜쌍용아이티 인사관리 ERP 입니다.");
			System.out.println("1. 로그인");
			System.out.println("2. 프로그램 종료");
			
			System.out.print("입력: ");
			String input=scan.nextLine();
			
			if(input.equals("1")) {
				login();
			}else if(input.equals("2")) {
				loop=false;
			}
		}
	}

	public static void login() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String id=scan.nextLine();
		System.out.print("비밀번호: ");
		String pw=scan.nextLine();
		
	}
}
