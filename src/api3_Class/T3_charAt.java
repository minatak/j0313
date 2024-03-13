package api3_Class;

import java.util.Scanner;

public class T3_charAt {
	public static void main(String[] args) {
		//성별코드가 1또는 3이면 남자, 2또는 4이면 여자로 출력해주시오.
		Scanner sc = new Scanner(System.in);
		String name;
		String jumin = "0";
		char gender = 0;
		String strGender = "";
		
		System.out.print("이름을 입력해주세요 > ");
		name = sc.next();
		
		System.out.print("주민등록번호를 입력해주세요(하이픈(-) 포함 입력) > ");
		jumin = sc.next();
		
		String[] juminArr = jumin.split("-");
		
		gender = jumin.charAt(7);
		
		if(gender == '1' || gender == '3') strGender = "남자";
		else if(gender == '2' || gender == '4') strGender = "여자";
		else strGender = "주민번호 오류";
		
		System.out.println(name + "님의 성별은 " +strGender+ "입니다.");
	}
}
