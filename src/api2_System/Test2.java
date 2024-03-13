package api2_System;

public class Test2 {
	public static void main(String[] args) {
		int i, tot=0;
		
		for(i=1; i<=100000000;i++) {
			tot+=i;
			if(tot >= 10000) {
				System.out.println("합이 10000이상일 때 i값은? " + i);
				// break;
				return; // 이렇게 끝낼 수 있지만 중괄호가 완전히 닫힌게 아니라 위험할 수 있음
			}
		}
		System.out.println("작업끝");
	}
}
