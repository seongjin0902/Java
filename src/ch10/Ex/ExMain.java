package ch10.Ex;

class Seller {

	private int MyMoney;
	private int AppleCnt;
	private int Price;

	public Seller(int myMoney, int appleCnt, int price) {
		MyMoney = myMoney;
		AppleCnt = appleCnt;
		Price = price;
	}

	public int Receive(int money) {
//		1. money를 MyMoney에 누적
		MyMoney += money;
//		2. money에 해당되는 만틈 사과개수를 계산
		int revcnt = money / Price;
//		3. AppleCnt에서 계산된 만큼의 사과개수를 차감
		AppleCnt -= revcnt;
//		4. 계산된 사과개수를 리턴
		return revcnt;
	}

	public void ShowInfo() {
//		속성 정보를 Console에 출력
		System.out.println("보유 금액 : " + MyMoney);
		System.out.println("사과 개수 : " + AppleCnt);
		System.out.println("개당 가격 : " + Price);

	}

}

class Buyer {
	private int MyMoney;
	private int AppleCnt;

	public Buyer(int myMoney, int appleCnt) {
		MyMoney = myMoney;
		AppleCnt = appleCnt;
	}

	public void Payment(Seller sellor, int money) {

//		1. seller에게 money전달
		MyMoney -= money;
//		2. sellor에게 money 전달
		int cnt = sellor.Receive(money);
//		3. seller로부터 사과개수받기

//		4. 사과개수를 멤버인 AppleCnt 누적
		AppleCnt += cnt;
	}

	public void ShowInfo() {

//		속성 정보를 Console에 출력

		System.out.println("보유 금액 : " + MyMoney);
		System.out.println("사과 개수 : " + AppleCnt);
		System.out.println();


	}
}

public class ExMain {

	public static void main(String[] args) {

		Seller 사과장수1 = new Seller(100000,100,1000);	//보유금액, 사과개수, 개당가격
		Buyer 아기오구 = new Buyer(10000,0);		//보유금액, 사과개수
		Buyer 오구 = new Buyer(20000,0);
		Buyer 뚜지 = new Buyer(30000,0);
		
		아기오구.Payment(사과장수1, 2000);
		오구.Payment(사과장수1, 5000);
		뚜지.Payment(사과장수1, 3000);
		

		System.out.println("-------판매자 정보-------");
		사과장수1.ShowInfo();
		
		System.out.println("-------구매자 정보-------");
		System.out.println("[아기오구]");
		아기오구.ShowInfo();
		System.out.println("[오구]");
		오구.ShowInfo();
		System.out.println("[뚜지]");
		뚜지.ShowInfo();
		

	}

}
