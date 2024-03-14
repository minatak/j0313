package api8_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class T4_compare {
	public static void main(String[] args) {
		// 날짜시간비교(주의: 시간비교시는 ns(나노초)까지 비교된다.)
		LocalDateTime startDateTime = LocalDateTime.now();
		System.out.println("오늘(현재) 날짜/시간 : " + startDateTime);
		System.out.println();
		
		String tempToday = startDateTime.toString();
		String strToday = tempToday.substring(0, tempToday.indexOf("."));
		System.out.println("오늘(현재) 날짜/시간 : " + strToday);
	
		// 날짜와 시간 구분하기(T 문자를 기준으로 split() 메소드 이용하여 자르기)
		String strDate = strToday.split("T")[0];
		String strTime = strToday.split("T")[1];
		System.out.println("오늘날짜 : " + strDate); 
		System.out.println("오늘시간 : " + strTime);
		System.out.println("==================");
		
		// 비교할 날짜 / 시간
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 1, 14, 14, 30, 20);
		System.out.println("타겟(비교) 날짜/시간 : " + targetDateTime);
		System.out.println();
		
		String strTarget = targetDateTime.toString();
//		String bigyoToday = strtempToday.substring(0, strtempToday.indexOf("."));
		System.out.println("타겟(비교) 날짜/시간 : " + strTarget);
	
		
		String bigyoDate = strTarget.split("T")[0];
		String bigyoTime = strTarget.split("T")[1];
		System.out.println("비교날짜 : " + bigyoDate); 
		System.out.println("비교시간 : " + bigyoTime);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		if(strDate.equals(bigyoDate)) System.out.println("같은 날");
		else System.out.println("다른 날");
		
		// 날짜를 날짜형식으로 비교하고자 한다면? isEqual() : 동일날짜 비교, 이전날짜 비교: isBefore(), 이후날짜 비교: isAfter(), 날짜차이: Period
		System.out.println("isEqual() : " + startDateTime.isEqual(targetDateTime));
		System.out.println("isBefore() : " + startDateTime.isBefore(targetDateTime));
		System.out.println("isAfter() : " + startDateTime.isAfter(targetDateTime));
	
		// 날짜차이계산(Period 클래스)
		LocalDate startDate = LocalDate.now();
		LocalDate targetDate = LocalDate.of(2024, 1, 14);
		Period period = Period.between(startDate, targetDate);
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		
		
		// 해당월의 마지막 날짜 찾기 (__.atEndOfMonth()) 
		String lastDay = "2024-02-10";
//		LocalDate bigyoDate2 = LocalDate.parse(lastDay, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//		System.out.println(lastDay + "달의 마지막 일자? " + YearMonth.from(bigyoDate2).atEndOfMonth());
//		System.out.println(lastDay + "달의 마지막 일자? " + YearMonth.from(LocalDate.parse(lastDay, DateTimeFormatter.ofPattern("yyyy-MM-dd"))).atEndOfMonth());
		
		String lastDay2 = "24-2-10";
		System.out.println(lastDay + "달의 마지막 일자? " + YearMonth.from(LocalDate.parse(lastDay2, DateTimeFormatter.ofPattern("yy-M-d"))).atEndOfMonth());
	}
}
