package api4_String;

public class T03_substring {
	public static void main(String[] args) {
		//						 0         1         2
		//						 012345678901234567890
		String msg1 = "Welcome to Korea!!!";
		String msg2 = "한국에 방문하신 것을 환영합니다!!";
				
		// substring() : 지정된 위치(인덱스번지)의 값을 출력
		// substring(n) : 지정된 위치(인덱스번지)의 위치부터 마지막까지의 문자열을 출력
		// substring(n, m) : n 위치(인덱스번지)의 위치부터 m-1 위치까지의 문자열을 출력
		System.out.println("1.msg1에 3번째 인덱스 위치부터 출력하세요 : " + msg1.substring(3));
		System.out.println("2.msg1에 3번째부터 12번째 인덱스 앞까지 출력하세요 : " + msg1.substring(3,12));
		
		// Ko~ 단어를 출력?
		System.out.println("Ko~~ " + msg1.indexOf("Ko"));
		System.out.println("!!! " + msg1.indexOf("!!!"));
		System.out.println("Korea " + msg1.substring(msg1.indexOf("Ko"),msg1.indexOf("!!!")));
		
	}
}

// 숙제 힌트 -> String.length 로 찾아도 됨
