package api5_wrapper.숙제;

import java.util.Scanner;

/*

문제2) 콘솔을 통해서 아이디를 입력받는다.
단, 아이디는 영문대문자,영문소문자,숫자와 특수문자는 '_'을 사용할 수 있고,  길이는 4~20자 이내로 입력받을수 있도록 처리한다.(단, 기회는 3번으로 처리후 3번안에 처리못하면 작업을 20초간 종료시키게 한다.)

예) 

아이디를 입력하세요? abc
==> 입력된 아이디 abc는 사용하실수 없습니다.
계속할까요?(y/n) Y

-----------------------------------
아이디를 입력하세요? abc!
==> 입력된 아이디 abc!는 사용하실수 없습니다.
계속할까요?(y/n) Y

-----------------------------------
아이디를 입력하세요? abcdefghijklmnopqrstuvwzyz
==> 입력된 아이디 abcdefghijklmnopqrstuvwzyz는 사용하실수 없습니다.
지금부터 20초 사용이 제한됩니다.

! ! ! !  ! ! ! !  ! ! ! !  ! ! ! !  ! ! ! !  ! ! ! !  ! ! ! !  ! ! ! !  ! ! ! ! ! ! ! ! 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~(20초간 기다림.....)


아이디를 입력하세요? atom1234!
==> 입력된 아이디 atom1234!는 사용하실수 없습니다.
계속할까요?(y/n) Y

-----------------------------------
아이디를 입력하세요? atom1234
==> 입력된 아이디 는 사용하실수 없습니다.
atom1234 로그인 되었습니다.

*/
public class 숙제2_0313 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 String id;
		 String yn = "";
		 
		 while(true) {
			 System.out.println("아이디를 입력하세요.");
			 System.out.println("*영문 대/소문자, 숫자, 특수문자 '_'만 사용이 가능합니다.*");
			 System.out.print(" 입력 > ");
			 id = sc.next();
			 
			 System.out.print("다시 시도하시겠습니까? (Y/N) > ");
			 yn = sc.next();
			 yn = yn.toUpperCase();
			 if(yn.equals("N")) break;
		 }
		 sc.close();
	}
}
