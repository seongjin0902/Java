package ch19ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex2 {

	public static void main(String[] args) throws InterruptedException{

		// 1 ~ 45 까지숫자를 6개를 랜덤으로 받아(Random클래스를이용) set에 저장
		// [추가]저장된 set의 오름차순정렬을 해보세요(검색을통해서 해결해봅니다)

		Set<Integer> set = new HashSet();

		Random rnd = new Random();
		while (true) {
			if (set.size() == 6) {
				break;
			}
			System.out.println(rnd.nextInt(45) + 1);
			set.add(rnd.nextInt(45) + 1);

		}
//		for (Integer el : set) {
//			System.out.println(el + " ");
//		}
		List<Integer> list = new ArrayList(set);
		Collections.sort(list);
		for(Integer el : list) {
			System.out.print(el+" ");
		}
		Collections.sort(list,Collections.reverseOrder());
		System.out.println();
		for(Integer el : list) {
			System.out.print(el + " ");
		}


		
	}

}
