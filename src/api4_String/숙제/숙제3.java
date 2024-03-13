package api4_String.숙제;

import java.util.Scanner;

public class 숙제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = "";
        String find = "";
        int firstNumber = 0;
        int count = 1; // 실제 단어가 나타난 횟수 기록
        int cnt = 1; // 출력할 때 단어가 반복된 횟수 기록
        String[] Word = new String[20]; // 전에 찾은 단어 위치의 바로 다음 위치부터 출력된 단어
        int[] temp = new int[20]; // 찾을 단어의 다음번째 위치
        

        System.out.print("문장를 입력하세요 > ");
        sentence = sc.nextLine();
        System.out.println();

        System.out.print("찾고싶은 단어를 입력하세요 > ");
        find = sc.nextLine();
        System.out.println();

        firstNumber = sentence.indexOf(find); // 찾은 단어의 첫번째 위치
        
        if(firstNumber == -1) System.out.println("입력하신 단어는 입력하신 문장에 없는 단어입니다.");
        else {
	        Word[0] = sentence.substring(firstNumber);
	        temp[0] = firstNumber + Word[0].indexOf(find);
	
	
	        for (int i = 1; i < temp.length && count < temp.length; i++) {
	            int nextStart = temp[i - 1] + find.length();
	            Word[i] = sentence.substring(nextStart);
	            int nextWord = Word[i].indexOf(find);
	            if (nextWord >= 0) {
	                temp[i] = nextStart + nextWord;
	                count++; // 단어가 나타날 때마다 count 증가
	            } 
	            else break; // 다음 단어가 더 이상 없으면 반복 중단
	        }
	        
	        for (int i = 0; i < count; i++) {
	            System.out.println(cnt + "번째 " + find + "는 " + (temp[i]) + "번 위치에 있습니다.");
	            cnt++;
	        }
        }
        sc.close();
    }
}