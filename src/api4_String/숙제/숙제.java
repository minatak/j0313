package api4_String.숙제;

import java.util.Scanner;

public class 숙제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = "";
		String find = "";
		int firstNumber = 0;
		int lastNumber = 0;
		int[] temp = new int[100];
		
		//   012345
		// 01234567
		// hehehehe
		
		//    0123
		// 01234567
		// abcdabcd
		
		
		//        01234567
		//    012345678908
		// 0123456789012345
		// abcdabcdabcdabcd
		
		System.out.print("문장를 입력하세요 > ");
		sentence = sc.nextLine();
		
		
		System.out.print("찾고싶은 단어를 입력하세요 > ");
		find = sc.nextLine();
		
		System.out.println("찾은 단어의 첫번째 위치: " + (sentence.indexOf(find)));
		firstNumber = sentence.indexOf(find);
		System.out.println("찾은 단어의 끝 위치(단어 중복인 경우): " + (sentence.lastIndexOf(find)));
		lastNumber = sentence.lastIndexOf(find)+1;
		
		System.out.println();
		
		System.out.println("첫번째 위치 이후부터의 단어 b: " + sentence.substring(firstNumber+1));
		String b = sentence.substring(firstNumber+1); // 첫번째 찾은 단어의 바로 다음 위치부터 출력된 단어
		
		b.indexOf(find); // 찾을 단어의 두번째 위치 - 찾은 단어 다음부터 두번째 -> 
		
		int realB = firstNumber + b.indexOf(find) + 1; // 찾을 단어의 맨 앞에서부터 두번째 위치
		
		System.out.println("찾을 단어의 두번째 위치 : " + realB);
		
		System.out.println();
	
		//-------------------------------
		
		
		System.out.println("두번째 위치 이후부터의 단어 c: " + sentence.substring(realB+1));
		String c = sentence.substring(realB+1);


		int realC = (realB + c.indexOf(find) + 1);
		
		System.out.println("찾을 단어의 세번째 위치 : " + realC);

		//-------------------------------------
//		System.out.println("n번째 위치 이후부터의 단어 n+1: " + sentence.substring(real n+1));
//		String n+1 = sentence.substring(n+1);
//
//
//		int real n+1 = (realn + n+1.indexOf(find) + 1);
//		
//		System.out.println("찾을 단어의 n번째 위치 : " + realn);
		
		//-------------------------------
		
		
		
		sc.close();
	}
}
