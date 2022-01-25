package game.polymophism;
// 몬스터를 상속하게 해주세요 
public class Orc extends Monster {
	
   // Orc는 생성자를 통해 체력 5, 공격력 2를 갖습니다. 
  	public Orc() {
		super(5, 2,"오크", 3);
		
	}
}
