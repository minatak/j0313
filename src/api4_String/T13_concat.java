package api4_String;

// concat() : 문자열과 문자열의 결합('+' 연산자와 비슷~함(문자를 연결))
// contains() : 문자열의 포함유무 (있으면 true, 없으면 false를 반환)
public class T13_concat {
	public static void main(String[] args) {
		String str1 = "서울";
		String str2 = "부산";
		String gubun = "%";
		String res = "";
		
		res = str1 + gubun + str2;
		System.out.println("res : " + res);
	
		res = str1.concat(gubun).concat(str2); // 이 메소드 굉장히 중요함!!!! 데이터베이스에서 자주 사용하게 될 것.
		System.out.println("2.res : " + res);
		
		System.out.println(gubun.concat(str1).concat(gubun));
	}
}
