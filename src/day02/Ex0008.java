package day02;

import java.util.Scanner;

public class Ex0008 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = null;
		int n3 = 0, weight = 0, weight1 = 0, weight2 = 0;
		double wei= 0;
		int num;
		String result1;
		double d = weight;
		double dd = weight1;
		double ddd = weight2;
		double dddd = wei;
		
		System.out.println("==============");
		System.out.print("첫번째 물건 무게 : ");
		weight1 = (int) input.nextDouble();
		System.out.print("두번째 물건 무게 : ");
		weight2 = (int) input.nextDouble();
		double weight3 = 460.48;
		double weight4 = 460.48;
		weight = weight1 + weight2;
		weight4 = weight3-(weight1 + weight2);
		System.out.println("적재 무게 : "+weight4+" ");
		
		System.out.println("==============");
		
		System.out.print("키 : " );
		n3 = input.nextInt();
		wei = (int)(n3+ -100)*0.9d;
		System.out.println("표준체중 : "+wei+" ");
		
		System.out.println("==============");
		
		
	
		
	}

}
