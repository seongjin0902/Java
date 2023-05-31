package ch06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		if(age >=8)
		{
			System.out.println("학교에 다닙니다");
		}
		System.out.println("첫번째 IF 블럭 종료");
		if(age <8)
		{
			System.out.println("학교에 다니지 않습니다");
		}
		System.out.println("두번째 IF 블럭 종료");
		System.out.println("프로그램을 종료합니다");

	}

}
