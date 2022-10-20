package java014_api;
/*
 * 수능일: 2022-11-17
 * 오늘: 2022-10-20
 * 남은일: 15
 */

import java.util.Calendar;

public class Java151_Calendar {
	public static void main(String[] args) {
		Calendar examDay = Calendar.getInstance();
		int examDay_year = 2022;
		int examDay_month = 11;
		int examDay_date = 17;

		examDay.set(examDay_year, examDay_month - 1, examDay_date);
		System.out.println(examDay.toString());

		Calendar toDay = Calendar.getInstance();
		System.out.println(toDay);

		long eventDay = examDay.getTimeInMillis();
		long nowDay = toDay.getTimeInMillis();
		System.out.println("eventDay: " + eventDay);
		System.out.println("nowDay: " + nowDay);

		// 하루 계산
		System.out.println(60 * 60 * 24 * 1000);

		long endDay = (eventDay - nowDay) / (60 * 60 * 24 * 1000);
		System.out.println("남은 일: " + endDay); // 남은 일: 27

	}// end main()

}// end class
