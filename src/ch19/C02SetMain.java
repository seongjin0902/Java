package ch19;

import java.util.HashSet;
import java.util.Set;

public class C02SetMain {

	public static void main(String[] args) {

		Set<String> set = new HashSet();

		set.add("HTML/CSS/JS");
		set.add("React");
		set.add("Redux");
		set.add("Redux");			// 중복 발생 시 나중에 저장된 것은 삭제, 새로 들어온 것을 삽입
		set.add("Typescript");
		set.add("MySQL");

		System.out.println("개수 확인 : " + set.size());
		set.remove("React");
		System.out.println("개수 확인 : " + set.size());
		
		System.out.println();
		
		for(String e1 : set) {
			System.out.println(e1);
		}
		set.clear();		//전체 삭제
	}

}
