package ch04;

import java.util.Scanner;

public class C03Test {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);

//		System.out.println("짝수인지? " + (num1 % 2));
//		
//		if(num1%2==0)
//		{
//			System.out.println("짝수 !");
//		}
//		else
//		{
//			System.out.println("홀수 !");
//		}

//		02 Math.random();
//		while(true) {
//			System.out.println(Math.random()*100);
//		}

//		문제
//		두 수를 입력 받아 두 수의 합/차/곱을 출력하는 프로그램을 만들어보세요

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("합 : " + (a + b));
		System.out.println("차 : " + (a - b));
		System.out.println("곱 : " + (a * b));
		sc.close();
		
//		대입연산자
		
	}

}
