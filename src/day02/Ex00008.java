package day02;

import java.util.Scanner;

public class Ex00008 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		String name;
		String name1 = null;
		int kor = 0 , eng = 0 , mat = 0, sum, ave;
		
		System.out.println("<결과>");
		System.out.print("학생이름 : ");
		name = input.next();
		System.out.print("국어점수 : ");
		kor = input.nextInt(); 
		System.out.print("영어점수 : ");
		eng = input.nextInt(); 
		System.out.print("수학점수 : ");
		mat = input.nextInt(); 
		System.out.println("================학생정보===============");
		System.out.println("이름\t 국어\t  영어\t  수학\t  합계\t  평균");
		sum = kor + eng + mat ;
		int nn3 = 3;
		ave = sum/nn3;
		System.out.println("-------------------------------------");
		System.out.println(name+"\t   " +kor+"\t   " +eng+"\t   " +mat+"\t   " +sum+"\t   " +ave);
		
		System.out.println("<결과>");
		System.out.println("학생이름 : "+name);
		System.out.println("===========");
		System.out.println("국어점수 : "+kor);
		System.out.println("영어점수 : "+eng);
		System.out.println("수학점수 : "+mat);
		System.out.println("================학생정보===============");
		System.out.println("이름\t 국어\t  영어\t  수학\t  합계\t  평균");
		System.out.println("--------------------------------------");
		System.out.println(name+"\t" +kor+"\t" +eng+"\t" +mat+"\t" +sum+"\t" +ave);
		
	}

}
