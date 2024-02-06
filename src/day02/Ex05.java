package day02;

public class Ex05 {
	public static void main(String[] args) {
		final String KOREA = "대한민국"; // final 상수화 한번 정하면 고정, 무조건 대문자
		System.out.println(KOREA);
		//korea = "미국"; //에러 발생시 주석으로 묶음
		System.out.println(KOREA);
		
		String str = "김말이";
		int age = 20;
		double height = 173.3;
		int iq = 120;
		char ch = 'B';
		System.out.println("이름\t : "+str);
		System.out.println("나이\t : "+age+"");
		System.out.println("키\t : "+height+"");
		System.out.println("아이큐\t : "+iq+"");
		System.out.println("등급\t : "+ch);
		
		
	}

}
