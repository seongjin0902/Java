package ch08;

import java.util.Scanner;

public class Sum {
//	속성
	Scanner sc = new Scanner(System.in);

//	기능
//	인자 o, 반환 o
	int sum1(int x, int y) {
		System.out.println("sum1(x,y) 호출!");
		return x + y;
	}

//	인자 x, 반환 o
	int sum2() {
		System.out.println("void sum2(x,y) 호출!");
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x + y;
	}

//	인자 o, 반환 x
	void sum3(int x, int y) {
		System.out.println("void sum3(int x, int y) 호출!");
		System.out.println(x + " + " + y + " = " + (x + y));
	}

//	인자 x, 반환 x 
	void sum4() {
		System.out.println("void sum4() 호출!");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(x + " + " + y + " = " + (x + y));
	}

}
