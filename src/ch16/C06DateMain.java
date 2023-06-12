package ch16;

import java.util.Calendar;
import java.util.Date;

public class C06DateMain {

	public static void main(String[] args) {
		
		Date d1=new Date();
		System.out.println(d1);
		System.out.println(d1.getYear());
		System.out.println(d1.getMonth()+1+"월");
		System.out.println(d1.getDay());
		System.out.println(d1.getDate()+"일");
		System.out.println(d1.getHours()+"시");
		System.out.println(d1.getMinutes()+"분");
		System.out.println(d1.getSeconds()+"초");
		
//		Calendar
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
//		System.out.println(Calendar.SUNDAY);		//1
//		System.out.println(Calendar.MONDAY);		//2
//		System.out.println(Calendar.TUESDAY);		//3
//		System.out.println(Calendar.WEDNESDAY);		//4
//		System.out.println(Calendar.THURSDAY);		//5
//		System.out.println(Calendar.FRIDAY);		//6
//		System.out.println(Calendar.SATURDAY);		//7

	}

}
