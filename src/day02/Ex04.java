package day02;

public class Ex04 {
	public static void main(String[] args) {
		char ch = 'A';
		System.out.println( ch );
		int num = ch; //자동 형 변환
		System.out.println( num );
		char ch02 = (char)num; //강제 형변환 바이트가 줄어든다
		System.out.println( ch02 );
		
		double d = 1.111;
		float f = (float)1.111;
		float f1 = 1.111f; //위와 둘중에 하나 사용가능
		
	}
}
