package structure;

public class ClassMain02P196 {

	public static void main(String[] args) {
		// 차2대 생성
		Car c1 = new Car();
		c1.model = "포르쉐" ;
		c1.price = 120000000 ;
		c1.owner = "신란희";

		Car c2 = new Car();
		c2.model = "벤츠";
		c2.price = 100000000;
		c2.owner = "라니" ;
		
		// 콘솔에 정보 조회하기
	    c1.getInfo();
	    c2.getInfo();
	}

}
