package a0_exam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import javax.swing.text.DateFormatter;

/*
회원명 회원가입일자
========================

홍길동 2000-1-1
김말숙 2020-12-31
이기자 2019-5-20
소나무 2024-3-14
아톰맨 2022-11-22
에이맨 2023-12-11
오하늘 2024-3-14
최고봉 2021-3-14
으뜸맨 2023-5-2
사랑이 2024-3-13
감나무 2022-10-10
행복맨 2000-12-12
가나다 2024-2-28
오솔길 2024-3-1

========================

(문제1)앞의 자료는 회원들의 등록일을 기억하고 있다.(모두 오늘 날짜를 기준으로 처리한다.)
1. 등록된 회원들이 1년이상된 회원들의 명단출력?(단, 지금부터 몇개월이 지났는지와 함께 출력)
2. 최근 1달안에 등록된 회원들의 명단과 경과된 일수를 함께 출력?
3. 오늘 등록한 회원들의 명단과 경과된 시간을 함께 출력?

*/
public class Test1_0314 {
	public static void main(String[] args) {
		String[][] list =
			{
					{"홍길동", "2000-1-1"},
					{"김말숙", "2020-12-31"},
					{"이기자", "2019-5-20"},
					{"소나무", "2024-3-14"},
					{"아톰맨", "2022-11-22"},
					{"에이맨", "2023-12-11"},
					{"오하늘", "2024-3-14"},
					{"최고봉", "2021-3-14"},
					{"으뜸맨", "2023-5-2"},
					{"사랑이", "2024-3-13"},
					{"감나무", "2022-10-10"},
					{"행복맨", "2000-12-12"},
					{"가나다", "2024-2-28"},
					{"오솔길", "2024-3-1"},
			};
		
		DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-M-d");
		
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime res = now.minusYears(1); // 오늘 날짜에서 1년 빼기
		res.toString().substring(0, 4); 
		
		System.out.println("1년뺀날짜" + res);
		
		for(int i=0; i<list.length; i++) {
			for(int j=0; j<list[i].length; j++) {
				if (j==1) {
					String dateString = list[i][j];
					dateString = dateString.substring(0, 4);
//					if(dateString.isBefore(targetDateTime))
				}
			}
		}
//		DateTimeFormatter date = dateString;
		
		System.out.println("*등록일이 1년 이상 경과한 회원들의 명단*");
//		if(dateString.)
//		System.out.println("isBefore() : " + date.isBefore(targetDateTime));
	}
}
