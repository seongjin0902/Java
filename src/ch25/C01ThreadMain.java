package ch25;

public class C01ThreadMain {

	public static void main(String[] args) throws Exception {
		
//		Main Thread에서의 실행흐름
		
//		1 작업스레드 객체 생성
		C02Worker1 worker1 = new C02Worker1();
		C02Worker2 worker2 = new C02Worker2();
		
		
//		2 각각의 독립된 작업공간에 작업스레드를 할당
		Thread th1 = new Thread(worker1);
		Thread th2 = new Thread(worker2);

//		3 작업스레드 실행
		th1.start();
		th2.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("MAIN!!!!!!!!");
			Thread.sleep(500);
		}


	}

}
