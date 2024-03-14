package api10_pattern;

import java.util.regex.Pattern;

// 정규식은 Pattern 클래스를 사용
// 숫자 : ^[\\d]*$ 
public class Test1 {
	public static void main(String[] args) {
		String str1 = "1234";
		String str2 = "1A234";
		
		// 정규식을 만들고, 입력 데이터와 조건비교처리한다. 
		String regEx = "^[\\d]*$" ;
		
		// 1번 방법
		Boolean pattern1 = Pattern.compile(regEx).matcher(str1).find(); // 보통 정규식의 값은 레퍼클래스로 준다 (객체타입)
		Boolean pattern2 = Pattern.compile(regEx).matcher(str2).find(); // 보통 정규식의 값은 레퍼클래스로 준다 (객체타입)
		
		System.out.println("1. : " + pattern1);
		System.out.println("2. : " + pattern2);
		
		// 2번 방법
		Boolean pattern3 = Pattern.matches(regEx, str1);
		Boolean pattern4 = Pattern.matches(regEx, str2);
		System.out.println("3. : " + pattern3);
		System.out.println("4. : " + pattern4);
		
		System.out.println("5. : " + Pattern.matches(regEx, str1));
		System.out.println("6. : " + Pattern.matches(regEx, str2));
		
		System.out.println();
		
		// 프로그램에서의 적용 예 ...
		if(Pattern.matches(regEx, str1)) System.out.println("str1은 숫자가 맞습니다.");
		else System.out.println("str1은 숫자가 아닌 값(/문자)을 포함하고 있습니다.");

		if(Pattern.matches(regEx, str2)) System.out.println("str2은 숫자가 맞습니다.");
		else System.out.println("str2은 숫자가 아닌 값(/문자)을 포함하고 있습니다.");
	}
}
