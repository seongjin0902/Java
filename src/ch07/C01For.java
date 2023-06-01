package ch07;

import java.util.Scanner;

public class C01For {

	public static void main(String[] args) {
		
//		구구단
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=9;i++)
		{
			System.out.println(n+"x"+i+" = "+n*i);
		}


	}

}
