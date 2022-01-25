package game.polymophism;
// 현재 몬스터 클래스에 대한 다향성을 활용하기 위해 설계했으므로
// 모든 몬스터 계열 클래스는 Monster를 상속 받습니다.
public class Ghost extends Monster {
	// 이미 몬스터 계열에 피룡한 정보는 모두 Monster 클래스에 
	// 작성되어있으므로 그냥 체력수치와 공격력 수치만 몬스터별로 관리하면 됩니다. 
	
	public Ghost() {
		super(7,4, "유령", 4) ;
	}

}
