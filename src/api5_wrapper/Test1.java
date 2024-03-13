package api5_wrapper;

// Wrapper클래스 : 기본타입을 참조타입으로(Boxing), 참조타입을 기본타입으로(UnBoxing) 형변환
public class Test1 {
	public static void main(String[] args) {
		int intSu1 = 100, intSu2 = 200;
		System.out.println("1. intSu1 + 100 : " + (intSu1 + 100));
		
		// 정수형 Boxing처리(Integer) - 기본타입(int)가 참조타입(객체)로 타입이 변환됨
		Integer objSu1 = new Integer(intSu1);
		System.out.println("2. objSu1 + 100 : " + (objSu1 + 100));
		
		// 자동박싱 처리의 예
		Integer objSu2;
		objSu2 = intSu1;
		System.out.println("2. objSu2 + 100 : " + (objSu2 + 100));
		
		// UnBoxing처리
		String strIntSu1 = "100";
		System.out.println("strIntSu1 + 100 = " + (strIntSu1 + 100));
		System.out.println("strIntSu1 + 100 = " + (Integer.parseInt(strIntSu1) + 100));
		
		// double <-> Double
		double dblsu = 3.14;
		Double objDblSu = new Double(dblsu); // boxing을 시켰다 해서 문자가 된 것이 아니고 단지 객체화 된 것이기 때문에 본래의 성질을 여전히 가지고 있음! (계산됨)
		System.out.println("2. objDblSu + 100.5 : " + (objDblSu + 100.5));
		
		int su3 = 100;
		Integer objSu3 = Integer.valueOf(su3);
		System.out.println("3. objSu3 + 100 : " + (objSu3 + 100));
		
		// UnBoxing
		int su4 = Integer.valueOf(objSu3);
		System.out.println("su4 + 100 : " + (su4 + 100));
	}
}
