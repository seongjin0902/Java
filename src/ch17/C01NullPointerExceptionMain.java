package ch17;

public class C01NullPointerExceptionMain {

	public static void main(String[] args) {

		try {
			String str = null;
			System.out.println(str.toString()); 	// NullPointerException 예외 객체가 생성되는 시점
		} catch (NullPointerException e) {
			System.out.println("예외 발생!!");
			System.out.println(e.getCause());  		// 예외 원인
			System.out.println(e.toString());		// 예외 객체 메시지
			System.out.println(e.getStackTrace());	// 예외 객체 식별정보
			
			e.printStackTrace();

		}

		System.out.println("실행해야되는 코드1");
		System.out.println("실행해야되는 코드2");

	}

}
