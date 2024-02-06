package day02;

import java.util.Scanner;

public class Hm02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num10;
		String name10;
		String name11 = null;
		int kor = 0, eng = 0, mat = 0, sum;
		
		System.out.println("===========");
		System.out.print("이름 : ");
		name10 = input.next();
		System.out.println("===========");
		System.out.print("국어 : ");
		kor = input.nextInt();
		System.out.print("영어 : ");
		eng = input.nextInt();
		System.out.print("수학 : ");
		mat = input.nextInt();
		System.out.println("===========");
		sum = kor + eng +mat;
		System.out.println("합계 : ");
		System.out.println("===========");
		
		System.out.println("===========");
		System.out.println("이름 : "+name10);
		System.out.println("===========");
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+mat);
		System.out.println("===========");
		System.out.println("합계 : "+sum);
		System.out.println("===========");
		
		
	}

}
