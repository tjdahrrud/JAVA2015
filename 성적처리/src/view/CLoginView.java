package view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import entity.CMember;

public class CLoginView {
	
	public CMember login() {			//value object
		Scanner scan = new Scanner(System.in);
		//input from keyboard using scanner
		CMember member = new CMember();
		System.out.print("사용자 ID를 입력하세요: ");
		String userID = scan.next();	//엔터에서 끊는다
		member.setUserID("userID");

		System.out.print("사용자 Password를 입력하세요: ");
		String password = scan.next();
		member.setPassword("password");
		//close scanner
		scan.close();		//항상 스캐너를 닫아주는 버릇
		return member;
	}
}