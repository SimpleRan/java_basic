package overriding;

public class Main01P265 {

	public static void main(String[] args) {
		// 말을 하나 생성해주시고
		// 오버라이드된 메서드들을 하나씩 호출해보세요.
		Horse h1 = new Horse ();
		h1.name = "번개맨";
		h1.age = 5;
		h1.gender = "수컷";
		h1.rank = 1;
		h1.howl();
		h1.getInfo();

		//강아지생성
		Dog d1 = new Dog();
		d1.name = "재롱이";
		d1.age = 3;
		d1.gender = "암컷";
		d1.color = "흰색";
		d1.howl();
		d1.getInfo();

		
	}

}
