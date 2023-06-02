package ch08;

class C07Simple {
	int sum(int... arg) {
		int sum = 0;
		for (int n : arg) {
			System.out.println("인자 값 : " + n);
			sum += n;
		}
		return sum;
	}
}

public class C07가변인자 {

	public static void main(String[] args) {

		C07Simple obj = new C07Simple();

		obj.sum(10);
		System.out.println();
		obj.sum(10, 20);
		System.out.println();
		obj.sum(10, 20, 30);
		System.out.println();
		obj.sum(10, 20, 30, 40);
		System.out.println();
		int r = obj.sum(10, 20, 30, 40, 50, 60, 70, 80);
		System.out.println("합 : " + r);

	}

}
