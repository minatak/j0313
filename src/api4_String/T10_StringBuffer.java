package api4_String;

/*
 		=> mutable(가변) / immutable(불가변)
 		String 객체 : immutable 객체로써 class로써 한번 크기가 생성된 값은 그 값을 유지하게 된다. 짧은 문자열 처리에 적합함.
 		StringBuffer 객체 : mutable 객체로써 크기를 변경할 수 있다. 동기화 & 멀티스레드를 제공한다. (사용하기 적절하다!). 가변길이 문자열에 적당함
 		StringBuilder 객체 : mutable 객체로써 크기를 변경할 수 있다. 동기화 여부가 불분명.가변길이 문자열에 적당함
 		성능: StringBuilder > StringBuffer >>>> String (가장 빠름)
 */
public class T10_StringBuffer {
	public static void main(String[] args) {
		String str = new String("홍길동");
		System.out.println("1.str : " + str);
		
		str += "/홍길동2";
		System.out.println("2.str : " + str);
		
		// capacity() : 현재 버퍼의 크기를 알아낸다.
    // str.capacity(); -> str은 불가변이기때문에 capacity를 사용할 수 없다.
		
		// StringBuffer()객체 : 가변길이의 클래스로써 기본크기는 16, 자료가 넘치면 상황에 따라서 크기를 변경처리한다.
		// append : 값을 추가할 때 사용하는 명령어, insert : 값을 특정위치에 삽입, delete : 특정위치의 값을 지정한 개수만큼 삭제 처리
		StringBuffer str2 = new StringBuffer();
		System.out.println("3.str2 버퍼크기 : " + str2.capacity());
		str2.append("atom");
		System.out.println("4.str2 : " + str2);
		System.out.println("5.str2 버퍼크기 : " + str2.capacity());
		
		str2.append("0123456789012345");
		System.out.println("6.str2 : " + str2);
		System.out.println("7.str2 버퍼크기 : " + str2.capacity());
		
		str2.insert(2, "abcdefg");
		System.out.println("8.str2 : " + str2);
		System.out.println("9.str2 버퍼크기 : " + str2.capacity());
		
		str2.delete(5, 20);
		System.out.println("10.str2 : " + str2);
		System.out.println("11.str2 버퍼크기 : " + str2.capacity());
		
	}
}
