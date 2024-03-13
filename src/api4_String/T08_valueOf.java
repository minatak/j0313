package api4_String;

import java.util.HashMap;

public class T08_valueOf {
	public static void main(String[] args) {
		// String.valueOf() : ~~자료형들을 '문자열'로 변환한다.
		
//		int intSu = 1234;
//		double dblSu = 1234.0;
		Integer intSu = 1234; // 일반타입 -> 객체타입으로 바뀜!
		Double dblSu = 1234.0;
		String strSu = "1234";
		HashMap<String, Integer> map = new HashMap<>();
		
		System.out.println(strSu);
		System.out.println(strSu.getClass().getName()); 
		System.out.println(intSu.getClass().getName()); // 이 타입은 기본타입->객체로 바꿔야지만 볼 수 있음 
		System.out.println(dblSu.getClass().getName());
		System.out.println(map.getClass().getName());
	
		// 일반 수치를 문자로 바꾸기 !!
		int intSu2 = 1234;
		System.out.println("1.intSu + 100 = " + (intSu+100));
//		String strSu2 = (String) intSu2; -> 에러남
//		String strSu2 = intSu2.toString(); -> 에러
		String strSu2 = intSu2 + ""; // 강제 형변환이 아닌 연산자에 의해 숫자+문자 -> 문자로 형변환 된 것.
		strSu2 = intSu2 + ""; // 가능.
		
		String strSu3 = String.valueOf(intSu2); 
		System.out.println(strSu3.getClass().getName()); 
		
		double db1Su4 = 3.14;
		String strSu4 = String.valueOf(db1Su4); 
		System.out.println(strSu4.getClass().getName()); 
		System.out.println();
		
		int a1 = 100, a2 = 200;
		int res = a1 + a2;
		System.out.println("res : " + res);
		
		String str5 = String.valueOf(a1) + String.valueOf(a2);
		System.out.println(str5);
		
//		int res6 = (int) (String.valueOf(a1)) + (int) (String.valueOf(a2)); (X) 
		int res6 = Integer.parseInt(String.valueOf(a1)) + Integer.parseInt(String.valueOf(a2)); 
		System.out.println("res6 : " + res6);
	}
}
