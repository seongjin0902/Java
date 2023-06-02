package ch08;

public class C04SimpleMethodTest {

	public static void main(String[] args) {

		Sum calc = new Sum();

		int result1 = calc.sum1(10, 20);
		System.out.println("result1 : " + result1);
		
		System.out.println("---------------------------------");

		int result2 = calc.sum2();
		System.out.println("result2 : " + result2);

		System.out.println("---------------------------------");
		
		calc.sum3(200, 300);
		
		System.out.println("---------------------------------");
		
		calc.sum4();
	}

}
