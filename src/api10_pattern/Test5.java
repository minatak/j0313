package api10_pattern;

import java.util.regex.Pattern;

// 문자열 정규식 (?는 0번이나 1번, +는 한 번 이상, *는 0번 이상)
public class Test5 {
	public static void main(String[] args) {
		String regEx1 = "^[a-zA-z0-9_-]+@[a-zA-z0-9_-]+\\.[a-z]+$"; // a 또는 b 또는 c 문자가 포함? ^[abc]*$ = ^[a|b|c]*$
		String regEx2 = "^[a-zA-z0-9_-]{3,}@[a-zA-z0-9_-]+\\.[a-z]+$"; // a 또는 b 또는 c 문자가 포함? ^[abc]*$ = ^[a|b|c]*$
		String regEx3 = "^[a-zA-z0-9_-]{3,12}@[a-zA-z0-9_-]+\\.[a-z]+$"; // a 또는 b 또는 c 문자가 포함? ^[abc]*$ = ^[a|b|c]*$
	
		
	
		String str00 = "";
		String str01 = "atom@naver.com";
		String str02 = "atom1234@naver.com";
		String str03 = "atom_1234@naver.com";
		String str04 = "atom!1234@naver.com";
		String str05 = "atom 1234@naver.com";
		String str06 = "atOM@naver214.542c10om";
		String str07 = "a@naver.com";
		String str08 = "at_OM@naver.com";
		String str09 = "a@naver.com";
		String str10 = "a_OM1234.co.kr";
		String str11 = "_at_om-1234.ver.COM";
		String str12 = "_at_om-1234.ver.co.kr";
		String str13 = "_at_om-1234.ver!COM";
		String str14 = "_at_om-1234.ver8.COM";
		String str15 = "_at_om-1234._ver.COM";
	
	
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
//		
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
//		
//		System.out.println("3:00= " + Pattern.matches(regEx3, str00));
//		System.out.println("3:01= " + Pattern.matches(regEx3, str01));
//		System.out.println("3:02= " + Pattern.matches(regEx3, str02));
//		System.out.println("3:03= " + Pattern.matches(regEx3, str03));
//		System.out.println("3:04= " + Pattern.matches(regEx3, str04));
//		System.out.println("3:05= " + Pattern.matches(regEx3, str05));
//		System.out.println("3:06= " + Pattern.matches(regEx3, str06));
//		System.out.println("3:07= " + Pattern.matches(regEx3, str07));
//		System.out.println("3:08= " + Pattern.matches(regEx3, str08));
//		System.out.println("3:09= " + Pattern.matches(regEx3, str09));
//		System.out.println("3:10= " + Pattern.matches(regEx3, str10));
//		System.out.println("3:11= " + Pattern.matches(regEx3, str11));
//		System.out.println("3:12= " + Pattern.matches(regEx3, str12));
//		System.out.println("3:13= " + Pattern.matches(regEx3, str13));
//		System.out.println("3:14= " + Pattern.matches(regEx3, str14));
//		System.out.println("3:15= " + Pattern.matches(regEx3, str15));
//		System.out.println();
//		
//		System.out.println("5:00= " + Pattern.matches(regEx4, str00));
//		System.out.println("5:01= " + Pattern.matches(regEx4, str01));
//		System.out.println("5:02= " + Pattern.matches(regEx4, str02));
//		System.out.println("5:03= " + Pattern.matches(regEx4, str03));
//		System.out.println("5:04= " + Pattern.matches(regEx4, str04));
//		System.out.println("5:05= " + Pattern.matches(regEx4, str05));
//		System.out.println("5:06= " + Pattern.matches(regEx4, str06));
//		System.out.println("5:07= " + Pattern.matches(regEx4, str07));
//		System.out.println("5:08= " + Pattern.matches(regEx4, str08));
//		System.out.println("5:09= " + Pattern.matches(regEx4, str09));
//		System.out.println("5:10= " + Pattern.matches(regEx4, str10));
//		System.out.println("5:11= " + Pattern.matches(regEx4, str11));
//		System.out.println("5:12= " + Pattern.matches(regEx4, str12));
//		System.out.println("5:13= " + Pattern.matches(regEx4, str13));
//		System.out.println("5:14= " + Pattern.matches(regEx4, str14));
//		System.out.println("5:15= " + Pattern.matches(regEx4, str15));
//		System.out.println();
//		
//		System.out.println("5:00= " + Pattern.matches(regEx5, str00));
//		System.out.println("5:01= " + Pattern.matches(regEx5, str01));
//		System.out.println("5:02= " + Pattern.matches(regEx5, str02));
//		System.out.println("5:03= " + Pattern.matches(regEx5, str03));
//		System.out.println("5:04= " + Pattern.matches(regEx5, str04));
//		System.out.println("5:05= " + Pattern.matches(regEx5, str05));
//		System.out.println("5:06= " + Pattern.matches(regEx5, str06));
//		System.out.println("5:07= " + Pattern.matches(regEx5, str07));
//		System.out.println("5:08= " + Pattern.matches(regEx5, str08));
//		System.out.println("5:09= " + Pattern.matches(regEx5, str09));
//		System.out.println("5:10= " + Pattern.matches(regEx5, str10));
//		System.out.println("5:11= " + Pattern.matches(regEx5, str11));
//		System.out.println("5:12= " + Pattern.matches(regEx5, str12));
//		System.out.println("5:13= " + Pattern.matches(regEx5, str13));
//		System.out.println("5:14= " + Pattern.matches(regEx5, str14));
//		System.out.println("5:15= " + Pattern.matches(regEx5, str15));
//		System.out.println();
//		
//		System.out.println("6:00= " + Pattern.matches(regEx6, str00));
//		System.out.println("6:01= " + Pattern.matches(regEx6, str01));
//		System.out.println("6:02= " + Pattern.matches(regEx6, str02));
//		System.out.println("6:03= " + Pattern.matches(regEx6, str03));
//		System.out.println("6:04= " + Pattern.matches(regEx6, str04));
//		System.out.println("6:05= " + Pattern.matches(regEx6, str05));
//		System.out.println("6:06= " + Pattern.matches(regEx6, str06));
//		System.out.println("6:07= " + Pattern.matches(regEx6, str07));
//		System.out.println("6:08= " + Pattern.matches(regEx6, str08));
//		System.out.println("6:09= " + Pattern.matches(regEx6, str09));
//		System.out.println("6:10= " + Pattern.matches(regEx6, str10));
//		System.out.println("6:11= " + Pattern.matches(regEx6, str11));
//		System.out.println("6:12= " + Pattern.matches(regEx6, str12));
//		System.out.println("6:13= " + Pattern.matches(regEx6, str13));
//		System.out.println("6:14= " + Pattern.matches(regEx6, str14));
//		System.out.println("6:15= " + Pattern.matches(regEx6, str15));
//		System.out.println();
//		
//		System.out.println("7:00= " + Pattern.matches(regEx7, str00));
//		System.out.println("7:01= " + Pattern.matches(regEx7, str01));
//		System.out.println("7:02= " + Pattern.matches(regEx7, str02));
//		System.out.println("7:03= " + Pattern.matches(regEx7, str03));
//		System.out.println("7:04= " + Pattern.matches(regEx7, str04));
//		System.out.println("7:05= " + Pattern.matches(regEx7, str05));
//		System.out.println("7:06= " + Pattern.matches(regEx7, str06));
//		System.out.println("7:07= " + Pattern.matches(regEx7, str07));
//		System.out.println("7:08= " + Pattern.matches(regEx7, str08));
//		System.out.println("7:09= " + Pattern.matches(regEx7, str09));
//		System.out.println("7:10= " + Pattern.matches(regEx7, str10));
//		System.out.println("7:11= " + Pattern.matches(regEx7, str11));
//		System.out.println("7:12= " + Pattern.matches(regEx7, str12));
//		System.out.println("7:13= " + Pattern.matches(regEx7, str13));
//		System.out.println("7:14= " + Pattern.matches(regEx7, str14));
//		System.out.println("7:15= " + Pattern.matches(regEx7, str15));
//		System.out.println();
//		
//		System.out.println("8:00= " + Pattern.matches(regEx8, str00));
//		System.out.println("8:01= " + Pattern.matches(regEx8, str01));
//		System.out.println("8:02= " + Pattern.matches(regEx8, str02));
//		System.out.println("8:03= " + Pattern.matches(regEx8, str03));
//		System.out.println("8:04= " + Pattern.matches(regEx8, str04));
//		System.out.println("8:05= " + Pattern.matches(regEx8, str05));
//		System.out.println("8:06= " + Pattern.matches(regEx8, str06));
//		System.out.println("8:07= " + Pattern.matches(regEx8, str07));
//		System.out.println("8:08= " + Pattern.matches(regEx8, str08));
//		System.out.println("8:09= " + Pattern.matches(regEx8, str09));
//		System.out.println("8:10= " + Pattern.matches(regEx8, str10));
//		System.out.println("8:11= " + Pattern.matches(regEx8, str11));
//		System.out.println("8:12= " + Pattern.matches(regEx8, str12));
//		System.out.println("8:13= " + Pattern.matches(regEx8, str13));
//		System.out.println("8:14= " + Pattern.matches(regEx8, str14));
//		System.out.println("8:15= " + Pattern.matches(regEx8, str15));
//		System.out.println();
//		
//		System.out.println("9:00= " + Pattern.matches(regEx9, str00));
//		System.out.println("9:01= " + Pattern.matches(regEx9, str01));
//		System.out.println("9:02= " + Pattern.matches(regEx9, str02));
//		System.out.println("9:03= " + Pattern.matches(regEx9, str03));
//		System.out.println("9:04= " + Pattern.matches(regEx9, str04));
//		System.out.println("9:05= " + Pattern.matches(regEx9, str05));
//		System.out.println("9:06= " + Pattern.matches(regEx9, str06));
//		System.out.println("9:07= " + Pattern.matches(regEx9, str07));
//		System.out.println("9:08= " + Pattern.matches(regEx9, str08));
//		System.out.println("9:09= " + Pattern.matches(regEx9, str09));
//		System.out.println("9:10= " + Pattern.matches(regEx9, str10));
//		System.out.println("9:11= " + Pattern.matches(regEx9, str11));
//		System.out.println("9:12= " + Pattern.matches(regEx9, str12));
//		System.out.println("9:13= " + Pattern.matches(regEx9, str13));
//		System.out.println("9:14= " + Pattern.matches(regEx9, str14));
//		System.out.println("9:15= " + Pattern.matches(regEx9, str15));
//		System.out.println();
		
	}
}
