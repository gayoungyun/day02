package day02;

import java.util.Scanner;

public class Hm04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = null;
		int year = 0, year1 =0, age = 0;
		
		System.out.print("올해의 년도 : ");
		year = input.nextInt();
		System.out.print("태어난 년도 : ");
		year1 = input.nextInt();
		age = year - year1;
		System.out.print("당신의 나이는 "+age+"살 입니다");
		age = input.nextInt();

		
	}

}
