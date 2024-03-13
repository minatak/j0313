package api4_String;

public class T01_trim {
	public static void main(String[] args) {
		String str1 = "  안  녕  ";
		String res;
		
		res = "1234" + str1 + "opq";
		System.out.println("1.res : " + res);
		
		res = "1234" + str1.trim() + "opq"; // trim = 바깥쪽 공백을 무시할 때 사용하는 메소드
		System.out.println("2.res : " + res);

	}
}
