package ch08ex;

public class C02CarMain {

	public static void main(String[] args) {
	//다음 main함수의 코드가 실행될수있도록 C01Car 클래스를 만드세요
		C02Car hongCar = new C02Car();
		hongCar.owner = "홍길동";
		hongCar.speed = 10;
		hongCar.fuel = 100;
		System.out.printf("%s %d %d\n",hongCar.owner,hongCar.speed,hongCar.fuel);
		hongCar.Accel();	//owner+ 님이 현재속도 + (speed+5)로 가속합니다 출력
		hongCar.Break();	//owner+ 님이 현재속도 + (speed-5)로 감속합니다 출력
		hongCar.ShowInfo();	//owner, speed, fuel이 출력
	}

}
