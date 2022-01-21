package superkeyword;

public class Main02 {

	public static void main(String[] args) {
		// 초음속 비행기를 만들겠습니다. 초기속도는 300 입니다.
		SupersonicAirplane SA = new SupersonicAirplane (300);
		
		
		// 비행을 2번하게 해 보세요.
		SA.fly();
		SA.fly();
	}

}
