package ch19ex;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

	public static void func1(List<String> list) {
		list.add("AAAAAAAA");
		list.add("BB");
		list.add("CCCCCCC");
//			ArrayList에 있는 문자열 중에서 길이가 5보다 큰 문자열만 출력하는 코드를 작성하세요.
//			func1함수 완성하기
	}

	public static List<String> func2() {
//			ArrayList에 있는 문자열 중에서 길이가 5보다 큰 문자열만 입력받는 코드를 작성하세요.
//			func2함수 완성하기
		return null;
	}

	public static void func3() {
//			ArrayList에 있는 정수값을 입력받는데 전달되는 수중에
//			짝수의 값만 입력받는 코드를 작성하세요.
//			func3함수 완성하기
	}

	public static void main(String[] args) {
		func1(new ArrayList());
		List<String> list = func2();
		func3();

	}

}
