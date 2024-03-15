package api10_pattern;

import java.util.regex.Pattern;

// 문자열 정규식 (?는 0번이나 1번, +는 한 번 이상, *는 0번 이상)
public class Test4 {
	public static void main(String[] args) {
		String regEx1 = "^[abc]*$"; // a 또는 b 또는 c 문자가 포함? ^[abc]*$ = ^[a|b|c]*$
		String regEx2 = "^[a-z]+$"; // 영문 소문자만 1번 이상
		String regEx3 = "^[A-Z]+$"; // 영문 대문자만 1번 이상
		String regEx4 = "^[a-zA-Z]*$"; // 영문 대/소문자만 0번 이상
		String regEx5 = "^[가-힣]*$"; // 한글만 0번 이상
		String regEx6 = "^[a-zA-Z가-힣]*$"; // 영문 대/소문자만 포함
		String regEx7 = "^[a-zA-Z가-힣 ]*$"; // 영문 대/소문자만 포함
		String regEx8 = "^[a-zA-Z가-힣0-9 ]*$"; // 영문 대/소문자만 포함
		String regEx9 = "^[a-zA-Z가-힣0-9_ ]*$"; // 영문 대/소문자만 포함
	
		String str00 = "";
		String str01 = "1234";
		String str02 = "1234dkjg";
		String str03 = "aaa";
		String str04 = "bc"; 
		String str05 = "asdc";
		String str06 = "ad-cf ";
		String str07 = "ASDF";
		String str08 = "abcsDf"; 
		String str09 = "abc   ";  // 공백(Space)
		String str10 = "abc		";  // 탭(Tab)
		String str11 = "ㄱ"; 
		String str12 = "그린컴퓨터"; 
		String str13 = "그린 컴퓨터"; 
		String str14 = "그린 Computer"; 
		String str15 = "그린2_Computer2"; 
	
		System.out.println("1:00= " + Pattern.matches(regEx1, str00));
		System.out.println("1:01= " + Pattern.matches(regEx1, str01));
		System.out.println("1:02= " + Pattern.matches(regEx1, str02));
		System.out.println("1:03= " + Pattern.matches(regEx1, str03));
		System.out.println("1:04= " + Pattern.matches(regEx1, str04));
		System.out.println("1:05= " + Pattern.matches(regEx1, str05));
		System.out.println("1:06= " + Pattern.matches(regEx1, str06));
		System.out.println("1:07= " + Pattern.matches(regEx1, str07));
		System.out.println("1:08= " + Pattern.matches(regEx1, str08));
		System.out.println("1:09= " + Pattern.matches(regEx1, str09));
		System.out.println("1:10= " + Pattern.matches(regEx1, str10));
		System.out.println("1:11= " + Pattern.matches(regEx1, str11));
		System.out.println("1:12= " + Pattern.matches(regEx1, str12));
		System.out.println("1:13= " + Pattern.matches(regEx1, str13));
		System.out.println("1:14= " + Pattern.matches(regEx1, str14));
		System.out.println("1:15= " + Pattern.matches(regEx1, str15));
		System.out.println();
		
		System.out.println("2:00= " + Pattern.matches(regEx2, str00));
		System.out.println("2:01= " + Pattern.matches(regEx2, str01));
		System.out.println("2:02= " + Pattern.matches(regEx2, str02));
		System.out.println("2:03= " + Pattern.matches(regEx2, str03));
		System.out.println("2:04= " + Pattern.matches(regEx2, str04));
		System.out.println("2:05= " + Pattern.matches(regEx2, str05));
		System.out.println("2:06= " + Pattern.matches(regEx2, str06));
		System.out.println("2:07= " + Pattern.matches(regEx2, str07));
		System.out.println("2:08= " + Pattern.matches(regEx2, str08));
		System.out.println("2:09= " + Pattern.matches(regEx2, str09));
		System.out.println("2:10= " + Pattern.matches(regEx2, str10));
		System.out.println("2:11= " + Pattern.matches(regEx2, str11));
		System.out.println("2:12= " + Pattern.matches(regEx2, str12));
		System.out.println("2:13= " + Pattern.matches(regEx2, str13));
		System.out.println("2:14= " + Pattern.matches(regEx2, str14));
		System.out.println("2:15= " + Pattern.matches(regEx2, str15));
		System.out.println();
		
		System.out.println("3:00= " + Pattern.matches(regEx3, str00));
		System.out.println("3:01= " + Pattern.matches(regEx3, str01));
		System.out.println("3:02= " + Pattern.matches(regEx3, str02));
		System.out.println("3:03= " + Pattern.matches(regEx3, str03));
		System.out.println("3:04= " + Pattern.matches(regEx3, str04));
		System.out.println("3:05= " + Pattern.matches(regEx3, str05));
		System.out.println("3:06= " + Pattern.matches(regEx3, str06));
		System.out.println("3:07= " + Pattern.matches(regEx3, str07));
		System.out.println("3:08= " + Pattern.matches(regEx3, str08));
		System.out.println("3:09= " + Pattern.matches(regEx3, str09));
		System.out.println("3:10= " + Pattern.matches(regEx3, str10));
		System.out.println("3:11= " + Pattern.matches(regEx3, str11));
		System.out.println("3:12= " + Pattern.matches(regEx3, str12));
		System.out.println("3:13= " + Pattern.matches(regEx3, str13));
		System.out.println("3:14= " + Pattern.matches(regEx3, str14));
		System.out.println("3:15= " + Pattern.matches(regEx3, str15));
		System.out.println();
		
		System.out.println("5:00= " + Pattern.matches(regEx4, str00));
		System.out.println("5:01= " + Pattern.matches(regEx4, str01));
		System.out.println("5:02= " + Pattern.matches(regEx4, str02));
		System.out.println("5:03= " + Pattern.matches(regEx4, str03));
		System.out.println("5:04= " + Pattern.matches(regEx4, str04));
		System.out.println("5:05= " + Pattern.matches(regEx4, str05));
		System.out.println("5:06= " + Pattern.matches(regEx4, str06));
		System.out.println("5:07= " + Pattern.matches(regEx4, str07));
		System.out.println("5:08= " + Pattern.matches(regEx4, str08));
		System.out.println("5:09= " + Pattern.matches(regEx4, str09));
		System.out.println("5:10= " + Pattern.matches(regEx4, str10));
		System.out.println("5:11= " + Pattern.matches(regEx4, str11));
		System.out.println("5:12= " + Pattern.matches(regEx4, str12));
		System.out.println("5:13= " + Pattern.matches(regEx4, str13));
		System.out.println("5:14= " + Pattern.matches(regEx4, str14));
		System.out.println("5:15= " + Pattern.matches(regEx4, str15));
		System.out.println();
		
		System.out.println("5:00= " + Pattern.matches(regEx5, str00));
		System.out.println("5:01= " + Pattern.matches(regEx5, str01));
		System.out.println("5:02= " + Pattern.matches(regEx5, str02));
		System.out.println("5:03= " + Pattern.matches(regEx5, str03));
		System.out.println("5:04= " + Pattern.matches(regEx5, str04));
		System.out.println("5:05= " + Pattern.matches(regEx5, str05));
		System.out.println("5:06= " + Pattern.matches(regEx5, str06));
		System.out.println("5:07= " + Pattern.matches(regEx5, str07));
		System.out.println("5:08= " + Pattern.matches(regEx5, str08));
		System.out.println("5:09= " + Pattern.matches(regEx5, str09));
		System.out.println("5:10= " + Pattern.matches(regEx5, str10));
		System.out.println("5:11= " + Pattern.matches(regEx5, str11));
		System.out.println("5:12= " + Pattern.matches(regEx5, str12));
		System.out.println("5:13= " + Pattern.matches(regEx5, str13));
		System.out.println("5:14= " + Pattern.matches(regEx5, str14));
		System.out.println("5:15= " + Pattern.matches(regEx5, str15));
		System.out.println();
		
		System.out.println("6:00= " + Pattern.matches(regEx6, str00));
		System.out.println("6:01= " + Pattern.matches(regEx6, str01));
		System.out.println("6:02= " + Pattern.matches(regEx6, str02));
		System.out.println("6:03= " + Pattern.matches(regEx6, str03));
		System.out.println("6:04= " + Pattern.matches(regEx6, str04));
		System.out.println("6:05= " + Pattern.matches(regEx6, str05));
		System.out.println("6:06= " + Pattern.matches(regEx6, str06));
		System.out.println("6:07= " + Pattern.matches(regEx6, str07));
		System.out.println("6:08= " + Pattern.matches(regEx6, str08));
		System.out.println("6:09= " + Pattern.matches(regEx6, str09));
		System.out.println("6:10= " + Pattern.matches(regEx6, str10));
		System.out.println("6:11= " + Pattern.matches(regEx6, str11));
		System.out.println("6:12= " + Pattern.matches(regEx6, str12));
		System.out.println("6:13= " + Pattern.matches(regEx6, str13));
		System.out.println("6:14= " + Pattern.matches(regEx6, str14));
		System.out.println("6:15= " + Pattern.matches(regEx6, str15));
		System.out.println();
		
		System.out.println("7:00= " + Pattern.matches(regEx7, str00));
		System.out.println("7:01= " + Pattern.matches(regEx7, str01));
		System.out.println("7:02= " + Pattern.matches(regEx7, str02));
		System.out.println("7:03= " + Pattern.matches(regEx7, str03));
		System.out.println("7:04= " + Pattern.matches(regEx7, str04));
		System.out.println("7:05= " + Pattern.matches(regEx7, str05));
		System.out.println("7:06= " + Pattern.matches(regEx7, str06));
		System.out.println("7:07= " + Pattern.matches(regEx7, str07));
		System.out.println("7:08= " + Pattern.matches(regEx7, str08));
		System.out.println("7:09= " + Pattern.matches(regEx7, str09));
		System.out.println("7:10= " + Pattern.matches(regEx7, str10));
		System.out.println("7:11= " + Pattern.matches(regEx7, str11));
		System.out.println("7:12= " + Pattern.matches(regEx7, str12));
		System.out.println("7:13= " + Pattern.matches(regEx7, str13));
		System.out.println("7:14= " + Pattern.matches(regEx7, str14));
		System.out.println("7:15= " + Pattern.matches(regEx7, str15));
		System.out.println();
		
		System.out.println("8:00= " + Pattern.matches(regEx8, str00));
		System.out.println("8:01= " + Pattern.matches(regEx8, str01));
		System.out.println("8:02= " + Pattern.matches(regEx8, str02));
		System.out.println("8:03= " + Pattern.matches(regEx8, str03));
		System.out.println("8:04= " + Pattern.matches(regEx8, str04));
		System.out.println("8:05= " + Pattern.matches(regEx8, str05));
		System.out.println("8:06= " + Pattern.matches(regEx8, str06));
		System.out.println("8:07= " + Pattern.matches(regEx8, str07));
		System.out.println("8:08= " + Pattern.matches(regEx8, str08));
		System.out.println("8:09= " + Pattern.matches(regEx8, str09));
		System.out.println("8:10= " + Pattern.matches(regEx8, str10));
		System.out.println("8:11= " + Pattern.matches(regEx8, str11));
		System.out.println("8:12= " + Pattern.matches(regEx8, str12));
		System.out.println("8:13= " + Pattern.matches(regEx8, str13));
		System.out.println("8:14= " + Pattern.matches(regEx8, str14));
		System.out.println("8:15= " + Pattern.matches(regEx8, str15));
		System.out.println();
		
		System.out.println("9:00= " + Pattern.matches(regEx9, str00));
		System.out.println("9:01= " + Pattern.matches(regEx9, str01));
		System.out.println("9:02= " + Pattern.matches(regEx9, str02));
		System.out.println("9:03= " + Pattern.matches(regEx9, str03));
		System.out.println("9:04= " + Pattern.matches(regEx9, str04));
		System.out.println("9:05= " + Pattern.matches(regEx9, str05));
		System.out.println("9:06= " + Pattern.matches(regEx9, str06));
		System.out.println("9:07= " + Pattern.matches(regEx9, str07));
		System.out.println("9:08= " + Pattern.matches(regEx9, str08));
		System.out.println("9:09= " + Pattern.matches(regEx9, str09));
		System.out.println("9:10= " + Pattern.matches(regEx9, str10));
		System.out.println("9:11= " + Pattern.matches(regEx9, str11));
		System.out.println("9:12= " + Pattern.matches(regEx9, str12));
		System.out.println("9:13= " + Pattern.matches(regEx9, str13));
		System.out.println("9:14= " + Pattern.matches(regEx9, str14));
		System.out.println("9:15= " + Pattern.matches(regEx9, str15));
		System.out.println();
		

	// 정규식 길이표현 => {1,~4} ({1글자 이상, 3글자 이하})
	}
}

