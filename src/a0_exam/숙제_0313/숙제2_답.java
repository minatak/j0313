package a0_exam.숙제_0313;

import java.util.Scanner;

public class 숙제2_답 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String temp = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";
		int cnt = 0;
		
		while(true) {
			int sw = 0;
			cnt++;
			System.out.print("아이디를 입력하세요 > ");
			String mid = sc.next();
			
			if(mid.length() < 4 || mid.length() > 20) sw = 1; 
			else {
				for(int i=0; i<mid.length(); i++) {
					if(!temp.contains(String.valueOf(mid.charAt(i)))) {
						sw = 1;
						break;
					}
				}
			}
			if(sw == 1) {
				System.out.println("입력된 아이디는 사용하실 수 없습니다.");
				if(cnt == 3) cnt = delayCheck();
			}
			else {
				System.out.println(mid + " 님 환영합니다 :)");
				break;
			}
		}
		sc.close();
	}
	
	private static int delayCheck() {
		System.out.println("====================");
		System.out.println("로그인 3번 실패로 10초간 작업이 중지됩니다.");
		for(int i=10; i>0; i--) {
			System.out.print(".");
			try { Thread.sleep(600); } catch(InterruptedException e) {}
		}
		System.out.println("\n 다시 로그인해보세요. 기회는 3번입니다 ^^");
		System.out.println("====================");
		return 0;
	}
	
	
}
