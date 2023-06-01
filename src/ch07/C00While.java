package ch07;

import java.util.Scanner;

public class C00While {

	public static void main(String[] args) {
		

//		int i=1;			//		1. 탈출용 변수
//		while(i<=10)		//		2. 탈출 조건식
//		{	
//			System.out.println("안녕");
//			i++;			//		3.탈출을 위한 연산
//		}
//		System.out.println("i : " + i);
		
		
//		02 1부터 10까지의 합
//		int i=1;
//		int sum=0;
//		while(i<=10)
//		{	
//			System.out.println("i : "+i);
//			i++;
//			sum+=i;
//		}
//		System.out.println("합 : "+sum);
		
//		03 1부터 n까지의 합
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		int i=1;
//		int sum=0;
//		while(i<=n)
//		{	
//			System.out.println("i : "+i);
//			sum+=i;
//			i++;
//		}
//		System.out.println("합 : "+sum);
		
//		문제1 n~m까지의 합
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int m=sc.nextInt();
//		if(n>m)
//		{
//			int tmp=n;
//			n=m;
//			m=tmp;
//		}
//		int sum=0;
//		
//		while(n<=m)
//		{
//			System.out.println(n);
//			sum+=n;
//			n++;
//		}
//		System.out.println(sum);
		
//		문제2 1~10까지 수 중에 짝수/홀수 의 합을 각각 출력
		
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		
//		int i=1;
//		int sum=0;
//		int sum2=0;
//		
//		while(i<=a)
//		{
//			if(a%2==0)
//			{
//				sum+=i;
//				i++;
//				System.out.println(i);
//			}
//			else
//			{
//				sum2+=i;
//				i++;
//				System.out.println(i);
//			}
//		}
//		System.out.println("짝수합계 : "+sum);
//		System.out.println("홀수합계 : "+sum2);
		
//		1~n까지의 수 중에 3의 배수만 출력하고 그 합도 출력
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		
//		int i=1;
//		int sum=0;
//		while(i<=9)
//		{
//			System.out.println(a+" x "+i+" = "+a*i);
//			sum+=a*i;
//			i++;
//		}
//		System.out.println("합 : "+sum);
		
//		중첩 while
		
//		int dan=2;
//		int i=1;
//		
//		while(dan<=9)
//		{
//			i=1;
//			while(i<=9)
//			{
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		
//		별찍기
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------");
		
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------");
		
		for(int i=0;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<=3;i++)
		{
			for(int j=3;j>=i;j--)
			{
				
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i*2-1;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		
	}

}
