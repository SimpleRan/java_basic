package stringbuilder1;

public class Builder05P408 {

	public static void main(String[] args) {
		// 다음 문자열을 문자를 0번부터 시작해서 3번째마다 삭제해주세요.
		// 힌트 : 반복문을 쓰세요
		// 문자열은 "abcdefghijklmnopqrstuvwxyz"입니다.
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		if (a.deleteCharAt(0)) {
		a.deleteCharAt(3*2);
		a.deleteCharAt(3*3);
		a.deleteCharAt(3*4);
		a.deleteCharAt(3*5);
		a.deleteCharAt(3*6);
		
		System.out.println("i % 3의 결과 : " + );
		System.out.println("현재 i의 값 : " + );
		System.out.println(a);
		
		System.out.println("-----------------------");
	}

}
