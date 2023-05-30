package Ch06;

import java.util.Scanner;

public class C02IF {

	public static void main(String[] args) {
		
//		입력 변수가 짝수이고, 3의 배수라면 출력
//		입력 변수가 홀수이고, 5의 배수라면 출력
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%2==0)
		{
			if(n%3==0)
			{
//				짝수이면서 3의배수
				System.out.println(n+" 은 짝수면서 3의배수");
			}
		}
		else
		{
				if(n%5==0)
				{
//					홀수이면서 5의배수
					System.out.println(n+" 은 홀수면서 5의배수");

				}
		}



	}

}
