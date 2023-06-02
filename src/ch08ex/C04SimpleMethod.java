package ch08ex;

import java.util.Scanner;

class Sub {

	int sub1(int x, int y) {
		System.out.println("sub1은?");
		return x - y;
	}

	int sub2(int x, int y) {
		System.out.println("sub2은?");
		if (x > y) {
			return x - y;
		} else {
			return y - x;
		}
	}

	int sub3(int x, int y, int z) {
		System.out.println("sub3은?");
		if (x > y && x > z) {
			return x - y - z;
		} else if (y > z && y > x) {
			return y - x - z;
		} else {
			return z - y - x;
		}
	}

}

class Mul {

	Scanner sc = new Scanner(System.in);

	int mul1(int x, int y) {
		System.out.println("mul1은?");
		return x * y;
	}

	int mul2(int x, int y, int z) {
		System.out.println("mul2은?");
		return x * y * z;
	}

	void mul3() {
		System.out.println("mul3은?");
		System.out.print("숫자1 : ");
		int x = sc.nextInt();
		System.out.print("숫자2 : ");
		int y = sc.nextInt();
		System.out.println("r6 : " + x + " x " + y + " = " + (x * y));
	}

}

public class C04SimpleMethod {

	public static void main(String[] args) {

		Sub subCal = new Sub();
		Mul mulCal = new Mul();

		int r1 = subCal.sub1(200, 100);
		System.out.println("r1 : " + r1);
		System.out.println("---------------");
		int r2 = subCal.sub2(100, 200); // 큰 수에서 작은 수의 뻴셈결과를 반환
		System.out.println("r2 : " + r2);
		System.out.println("---------------");
		int r3 = subCal.sub3(100, 500, 200);
		System.out.println("r3 : " + r3);
		System.out.println("---------------");
		int r4 = mulCal.mul1(10, 20);
		System.out.println("r4 : " + r4);
		System.out.println("---------------");
		int r5 = mulCal.mul2(10, 20, 30);
		System.out.println("r5 : " + r5);
		System.out.println("---------------");
		mulCal.mul3();

	}

}
