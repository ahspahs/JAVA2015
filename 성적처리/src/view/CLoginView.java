package view;

import java.util.Scanner;

import entity.CMember;

public class CLoginView {
	
	public CMember login() {
		Scanner scanner = new Scanner(System.in); 
		// input from keyboard using scanner
		CMember member = new CMember();
		System.out.print("����� ���̵� �Է��ϼ���: ");
//		String userId = scanner.next();		
		member.setUserID("userId");
		
		System.out.print("��й�ȣ�� �Է��ϼ���: ");
//		String password = scanner.next();		
		member.setPassword("password");
		// close scanner
		scanner.close();
		return member;
	}

}
