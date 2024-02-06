package day02;

import java.util.Scanner;

public class Ex008 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = null;
		int n1 = 0, num1 = 0, num2 = 0, year = 0, year1 = 0, age =0, 
				  weight = 0, weight1 = 0, weight2 = 0;
		int num;
		String result1;
		double d = weight;
		double dd = weight1;
		double ddd = weight2;
		
		
		System.out.print("수 입력 : ");
		n1 = input.nextInt();
		String result;
		result = (n1%3!=0)?n1+" = 짝수":n1+ " = 3의 배수가 아니다";
		System.out.println( result );
		result = (n1%3==0)?n1+" = 짝수":n1+ " = 3의 배수가 아니다";
		System.out.println( result );
		System.out.print("두수입력 : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		System.out.println("num1 : " +num1+ " ,num2 : " +num2);
		String result2;
		result2 = (num2>num1)?"num2가num1보다크다":"num1가num2보다크다";
		System.out.println(result2);
		
		System.out.println("==============");
		
		System.out.print("올해의 년도 : " );
		year = input.nextInt();
		System.out.print("태어난 년도 : " );
		year1 = input.nextInt();
		age = year - year1;
		System.out.println("당신의 나이는 "+age+" 살 입니다");
		age = input.nextInt();
		
		System.out.println("==============");
		System.out.println("첫번째 물건 무게 : ");
		weight1 = input.nextInt();
		System.out.println("두번째 물건 무게 : ");
		weight2 = input.nextInt();
		int weight3 = 600;
		double weight4 = 460.48;
		weight = weight1 + weight2;
		weight4 = weight3-(weight1 + weight2);
	
		
	
		
		
		
		
	}

}
