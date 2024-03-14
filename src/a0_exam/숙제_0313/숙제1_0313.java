package a0_exam.숙제_0313;

import java.util.Scanner;

import api3_Class.Test1;

public class 숙제1_0313 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fileName = "";
		String yn = "";
		
		while(true) {
			System.out.print("파일명을 입력하세요 > ");
			fileName = sc.next();
			
			String fileType = FileType(fileName);
			
			System.out.println(fileName + "은 " + fileType + "입니다.");
			
			System.out.print("계속하시겠습니까? (Y/N) > ");
			yn = sc.next();
			yn = yn.toUpperCase();
			if(yn.equals("N")) break;
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}


	public static String FileType(String fileName) {
		String[] type = fileName.split("[.]"); 
		String identify = type[type.length -1].toLowerCase();
		
		switch (identify) {
			case "jpg":
			case "jpeg":
			case "png":
			case "gif":
				return "그림파일";
			case "txt":
			case "doc":
			case "docx":
				return "텍스트파일";
			case "mp3":
				return "음악파일";
			case "mp4":
			case "mov":
				return "동영상파일";
			case "zip":
				return "압축파일";
			case "xlsx":
				return "엑셀파일";
			case "hwp":
				return "한글파일";
			default :
				return "잘못된 파일 형식";
		}	
	}
}
