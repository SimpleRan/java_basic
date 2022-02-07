package calendar1;

import java.util.Calendar;

public class Calendqr01P470 {

	public static void main(String[] args) {
		// Calendar는 현재 시간을 이반적인 방식이 아닌 요일, 오전/오후 등으로 
		// 달력기준으로 표기해주는 방식입니다.
		// Calendar.getInstance();를 이용해 사용합니다.
		// 추상클래스여서 new키워드로 직접 생성해 쓸 수 없습니다.
		Calendar now =Calendar.getInstance();
		System.out.println(now);

	}

}
