package day02;

import java.util.Scanner;

public class Hm05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = null;
		int weight = 0, weight1 = 0, weight2 = 0;
		double weight3 = 460.48;
		double d = weight;
		double dd = weight1;
		double ddd = weight2;
		int weight4 = 600;
		
		System.out.print("첫 번째 물건 무게 : ");
		weight = input.nextInt();
		System.out.print("두 번째 물건 무게 : ");
		weight1 = input.nextInt();
		weight2 = weight4-(weight + weight1);
		System.out.println("적개 가능 무게 : "+weight2+" ");
		

		
	}

}
