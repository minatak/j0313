package api4_String.숙제;

import java.util.Scanner;

public class 숙제2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = "";
		String find = "";
		int firstNumber = 0;
		String[] nextWord = new String[20]; // 전에 찾은 단어 위치의 바로 다음 위치부터 출력된 단어
		int[] temp = new int[20]; // 찾을 단어의 다음번째 위치
		

		System.out.print("문장를 입력하세요 > ");
		sentence = sc.nextLine();
		
		
		System.out.print("찾고싶은 단어를 입력하세요 > ");
		find = sc.nextLine();
		
		
		firstNumber = sentence.indexOf(find); // 찾은 단어의 첫번째 위치
		
		nextWord[0] = sentence.substring(firstNumber);
		temp[0] = firstNumber + nextWord[0].indexOf(find);
		
		for(int i=1; i<=temp.length; i++) {
			nextWord[i] = sentence.substring(temp[i-1]+1);
			temp[i] = temp[i-1] + nextWord[i].indexOf(find) + 1;
		}
		
		for(int i=0; i<temp.length; i++) {
			System.out.println(find + "는 " + temp[i] + "번 위치에 있습니다.");
		}
		
		
		sc.close();
	}
}
