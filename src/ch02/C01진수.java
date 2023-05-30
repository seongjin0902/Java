package ch02;

public class C01진수 {

	public static void main(String[] args) {

		// 2진수 -> 10진수
//		10101100 = 172
//		10011010 = 154
//		01101001 = 106
//		10010010 = 146

//		19
//		00010011

//		10진수 -> 2진수
//		192 = 11000000
//		224 = 11100000
//		252 = 11111100
//		12 =  00001100
//		15 =  00001111

//		코드 이쁘게 정리 : ctrl + shift + f
		
		System.out.printf("10진수 : %d\n", 0b0001111);
		System.out.printf("10진수 : %d\n", 173); // 10진수
		System.out.printf("10진수 : %d\n", 0255); // 8진수(0 :8진수를 의미하는 접두사)
		System.out.printf("10진수 : %d\n", 0xAD); // 16진수(0x : 16진수를 의미하는 접두사)

		System.out.printf("8진수 : %o\n", 173); // 10진수
		System.out.printf("8진수 : %o\n", 0255); // 8진수 (0 :8진수를 의미하는 접두사)
		System.out.printf("8진수 : %o\n", 0xAD); // 16진수 (0x : 16진수를 의미하는 접두사)

		System.out.printf("16진수 : %x\n", 173); // 10진수
		System.out.printf("16진수 : %x\n", 0255); // 8진수 (0 :8진수를 의미하는 접두사)
		System.out.printf("16진수 : %x\n", 0xAD); // 16진수 (0x : 16진수를 의미하는 접두사)
	}

}
