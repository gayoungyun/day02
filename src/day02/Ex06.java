package day02;

import java.util.Scanner; //특정페이지(기능)를 현재페이지로 가져옴

public class Ex06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Sc c spacebar 자료형 뒤에는 변수명input sc많이씀 , 무조건 한줄 추가
		int num;
		String name;
		System.out.println("이름 입력 : ");
		name = input.next(); //문자열 입력받는 기능
		
		System.out.print("수 입력 : ");
		num = input.nextInt(); //정수만 입력받음
		
		System.out.println("이름 : "+name);
		System.out.println("입력 수 : "+num);
		
		double dou;
		System.out.println("실수 입력");
		dou = input.nextDouble();
		System.out.println("실수 : "+dou);
		
		String nam;
		int nu;
		System.out.print("이름 : ");
		name = input.next();
		
		System.out.print("국어 : ");
		System.out.print("영어 : ");
		System.out.print("수학 : ");
		num = input.nextInt();
		
		System.out.println("이름 : "+name);
		System.out.println("입력 수 : "+num);
	}

}
