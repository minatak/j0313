package api4_String.숙제;

import java.util.Scanner;

public class 숙제_다른답 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
     int position = -1, cnt = 0;
     

     System.out.print("문장를 입력하세요 > ");
     String sentence = sc.nextLine();

     System.out.print("찾고싶은 단어를 입력하세요 > ");
     String find = sc.nextLine();
     System.out.println();
     
     if(sentence.indexOf(find) == -1) System.out.println("찾으시는 단어는 입력하신 문장에 없습니다.");
     else {
	     while(true) {
	    	 position = sentence.indexOf(find, position+1);
	    	 if(position == -1) break;
	    	 System.out.println((cnt+1) + "번째 "+find+"의 위치 : " + position);
	    	 cnt++;
	     }
     }
     System.out.println("다시하시겠습니까? (Y/N)");
     
     
     sc.close();
	}
}
