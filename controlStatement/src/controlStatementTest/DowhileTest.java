package controlStatementTest;

import java.util.Scanner;

public class DowhileTest {
	public static void main(String[] args) {
		String message = "1. 분실신고\n 2. 통신사 이동 n/ 3.결제 수단 변경 \n 0.상담원 연결";
		Scanner sc = new Scanner(System.in);
		int choice = 0; 
		
		
		do{
		System.out.println(message);
		choice = sc.nextInt();
		
		}while(choice != 0);
}
}
