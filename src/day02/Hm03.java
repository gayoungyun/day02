package day02;

import java.util.Scanner;

public class Hm03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = null;
		int n10 = 0, n11 = 0, n12 = 0;
		
		System.out.print("수 입력 : ");
		n10 = input.nextInt();
		String result;
		result = (n10%3!=0)?n10+ " = 짝수":n10+ " = 3의 배수가 아니다";
		System.out.println(result);
		String result2;
		result2 = (n10%3==0)?n10+ " = 짝수":n10+ " = 3의 배수가 아니다";
		System.out.println(result2);
		System.out.print("두 수 입력 : ");
		n11 = input.nextInt();
		n12 = input.nextInt();
		System.out.println("num11 : "+n11+ " ,num12 : "+n12);
		String result1;
		result1 = (n12>n11)?"n12이 n11보다 크다":"n112가 n12보다 크다";
		System.out.println(result1);
		
		
		
	}

}
