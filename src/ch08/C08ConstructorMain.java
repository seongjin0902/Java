package ch08;

//생성자 함수(메서드)
//객체 생성 시에 한 번 호출되는 특수한 메서드
//객체 생성 시에 1회 호출
//객체 생성 시 필요한 초기값을 부여
//생성자 함수는 클래스 이름과 동일하며 반환자료형을 가지지 않는다.
//생성자 함수를 명시하지 않을 때 기본적으로 컴파일러에 의해 주입되는 생성자가 있는데 이를 디폴트 생성자라고 한다.
//컴파일러에 의해 주입 받는 디폴트 생성자는 모든 멤버의 초기값을 0(or false or null)로 지정
class C08Simple {

	int n1;
	double n2;
	boolean n3;
	String n4;

//	디폴트 생성자
	C08Simple() {
		System.out.println("디폴트 생성자 호출!");
		this.n1 = 10;
		this.n2 = 20.2;
		this.n3 = true;
		this.n4 = "하오옵 쿰척쿰척";
	}

	C08Simple(int x) {
		System.out.println("C08Simple(int x) 생성자 호출!");
		this.n1 = x;
	}

	C08Simple(int... x) {
		System.out.println("C08Simple(int ...x) 생성자 호출!");
		for (int arg : x) {
			this.n1 += arg;
		}
	}

	@Override
	public String toString() {
		return "C08Simple n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + ", n4=" + n4;
	}
}

public class C08ConstructorMain {

	public static void main(String[] args) {

		C08Simple obj = new C08Simple();
		System.out.println(obj.toString());

		C08Simple obj2 = new C08Simple(20);
		System.out.printf("%d %f %b %s\n", obj2.n1, obj2.n2, obj2.n3, obj2.n4);

		C08Simple obj3 = new C08Simple(10, 20, 50, 40, 60, 80, 890, 888);
		System.out.printf("%d %f %b %s\n", obj3.n1, obj3.n2, obj3.n3, obj3.n4);
	}

}
