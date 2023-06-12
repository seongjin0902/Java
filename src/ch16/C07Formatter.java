package ch16;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C07Formatter {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("YYYY/MM/DD 입력 : ");
		String ymd = sc.next();
		
//		포메틱 객체 생성(입력받을 때의 포메팅)
		SimpleDateFormat fmtin = new SimpleDateFormat("yyyy/mm/dd");

		System.out.println(ymd);
		Date date = fmtin.parse(ymd);
		System.out.println(date);
		
//		포메틱 객체 생성(출력할 때의 포메팅)
		SimpleDateFormat fmtout = new SimpleDateFormat("yyyy-mm-dd");
		System.out.println(fmtout.format(date));


	}

}
