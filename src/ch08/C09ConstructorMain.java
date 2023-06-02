package ch08;

class C09Simple {

	
//	클래스 선언 시 생성자함수를 하나도 명시하지 않았을 때는 디폴트 생성자가 주입이 되나,
//	하나 이상의 생성자 함수가 명시되면 디폴트생성자는 주입되지 않는다.
	
	C09Simple() {}
	C09Simple(int x) {}

}

public class C09ConstructorMain {

	public static void main(String[] args) {

		C09Simple obj = new C09Simple();

	}

}
