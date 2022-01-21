package structure;

public class Structure03P190 {

	 public static void getInfo(Cat c) {
		 System.out.println(c.name + "의 정보입니다.");
		 System.out.println("이름 : " + c.name + 
				 ", 색깔 :" + c.color + ", 몸무게 : " + c.weight);
	 }
	public static void main(String[] args) {
		// 고양이 2마리 생성
	 Cat c1 = new Cat();
	 c1.name = "룰루";
			 c1.color = "쿠앤크";
			 c1.weight="3";
			 
	 Cat c2 = new Cat();
			 c2.name = "어묵이";
			 c2.color = "치즈";
			 c2.weight = "1";
			 
			 getInfo(c1);
			 getInfo(c2);

		
			 
	}

}
