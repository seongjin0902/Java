package ch08ex;

public class C02Car {
		String owner;
		int speed;
		int fuel;
		
		void Accel()
		{
			System.out.println(owner+"님이 현재속도 "+(speed+5)+"로 가속합니다");
		}
		void Break()
		{
			System.out.println(owner+"님이 현재속도 "+(speed-5)+"로 감속합니다");
		}
		void ShowInfo()
		{
			System.out.printf("%s %d %d",owner,speed,fuel);
		}
		
}

