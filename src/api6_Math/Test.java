package api6_Math;

public class Test {
	public static void main(String[] args) {
		int su1 = 100;
		int su2 = -100;
		
		// 절대값 : Math.abs()
		System.out.println("su1 : " + su1); 
		System.out.println("su2 : " + su2);
		System.out.println("Math.abs(su1) : " + Math.abs(su1));
		System.out.println("Math.abs(su2) : " + Math.abs(su2));
		
		double d1 = 1234.567;
		double d2 = -1234.567;
		
		// 반올림 : Math.round() - 무조건 정수형 반올림을 함(소수 첫째자리에서 반올림 후 정수로 표시)
		System.out.println("d1 : " + d1);
		System.out.println("d2 : " + d2);
		System.out.println("Math.round(d1) : " + Math.round(d1));
		System.out.println("Math.round(d2) : " + Math.round(d2));
		System.out.println();
		
		// 소수 첫째자리에서의 반올림 : 1234.567 + 0.5 = (int)1235.067 = 1235
		// 소수 둘째자리에서의 반올림 : 1234.567 + 0.05 = (int)1234.617 * 10 = (int)12346.17 = 12346 / 10 = 1234.6
		System.out.println(Math.round(d1*10) / 10.0);
		// 소수 둘째자리에서의 반올림 : 1234.567 + 0.005 = (int)1234.572 * 100 = (int)123457.2 = 123457 / 100 = 1234.57
		System.out.println(Math.round(d1*100) / 100.0);
		// 소수 넷째자리에서의 반올림 
		System.out.println(Math.round(d1*1000) / 1000.0);
		System.out.println();
		
		// String.format("%.nf", 실수) -> 소수 이하 n째 자리까지 반올림
		System.out.println(String.format("%.0f", d1));
		System.out.println(String.format("%.1f", d1));
		System.out.println(String.format("%.2f", d1));
		System.out.println(String.format("%.3f", d1));
		
		// 소수부 무조건 올림 : Math.ceil()
		System.out.println("1.ceil() : " + Math.ceil(d1)); // 실수형
		double d3 = 123.45;
		System.out.println("2.ceil() : " + Math.ceil(d3));
		// 소수이하 둘째자리에서 무조건 올림
		System.out.println("3.ceil() * 10 / 10 : " + Math.ceil(d1*10) / 10);
		// 소수이하 셋째자리에서 무조건 올림
		System.out.println("4.ceil() * 100 / 100 : " + Math.ceil(d1*100) / 100);
		System.out.println();
		
	  // 소수부 무조건 내림 : Math.floor()
		System.out.println("1.floor() : " + Math.floor(d1)); // 실수형
		double d4 = 123.65;
		System.out.println("2.floor() : " + Math.floor(d4));
		// 소수이하 둘째자리에서 무조건 올림
		System.out.println("3.floor() * 10 / 10 : " + Math.floor(d1*10) / 10);
		// 소수이하 셋째자리에서 무조건 올림
		System.out.println("4.floor() * 100 / 100 : " + Math.floor(d1*100) / 100);
		System.out.println();
		
		// 최대값 : max(), 최솟값 : min()
		System.out.println("5.max() : " + Math.max(d3, d4));
		System.out.println("6.min() : " + Math.min(d3, d4));
//		System.out.println("7.count() : " + Math.count(10, 20, 30)); // 자바에서 갯수를 구할 때는 length() 또는 size() 이용
		// length() : 문자열/배열에서 주로 사용, size() : 객체배열이나 클래스에서 사용, sizeOf() : 바이트 수 계산
		
		// 난수 : Math.random() : 0~1미만의 실수형 난수, (int)((Math.random()*(끝+1-시작))+시작));
		System.out.println("0~1미만의 난수 : " + Math.random());
		System.out.println("1~100까지의 난수 : " + (int)((Math.random()*100)+1));
		System.out.println("1~10까지의 난수 : " + (int)((Math.random()*10)+1));
		System.out.println("5~10까지의 난수 : " + (int)((Math.random()*(10+1-5))+5));
		System.out.println("20~30까지의 난수 : " + (int)((Math.random()*(30+1-20))+20));
		
	}
}
