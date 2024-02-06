package day02;

import java.util.Scanner;

public class Ex006 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		String name;
		String name1 = null;
		int kor = 0 , eng = 0 , mat = 0, sum, ave;
		
		System.out.println("===========");
		System.out.print("이름 : ");
		name = input.next();
		System.out.println("===========");
		System.out.print("국어 : ");
		kor = input.nextInt(); 
		System.out.print("영어 : ");
		eng = input.nextInt(); 
		System.out.print("수학 : ");
		mat = input.nextInt(); 
		System.out.println("===========");
		sum = kor + eng + mat ;
		System.out.println("합계 : " +sum );
		System.out.println("===========");
		sum = input.nextInt(); 
		
		System.out.println("===========");
		System.out.println("이름 : "+name);
		System.out.println("===========");
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+mat);
		System.out.println("===========");
		System.out.println("합계 : "+sum);
		System.out.println("===========");
		
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
		sum = kor + eng + mat ;
		int nn3 = 3;
		ave = nn3/sum;
		System.out.println("-------------------------------------");
		sum = input.nextInt(); 
		
		System.out.println("<결과>");
		System.out.println("학생이름 : "+name);
		System.out.println("===========");
		System.out.println("국어점수 : "+kor);
		System.out.println("영어점수 : "+eng);
		System.out.println("수학점수 : "+mat);
		System.out.println("================학생정보===============");
		System.out.println("이름 국어 영어 수학 합계 평균");
		System.out.println("--------------------------------------");
		System.out.println("+name +kor +eng +mat +sum +ave");
		
		
		
	}

}
