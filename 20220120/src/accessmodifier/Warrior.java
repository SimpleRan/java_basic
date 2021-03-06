package accessmodifier;

public class Warrior extends Commoner {
 	// commoner를 상속한 Warrior 클래스를 만들어주세요 
	 public Warrior(String name) {
	 super(name);	 
	 }	
	// 전사는 hunt를 할 경우 체력이 1 까이고
	// 경험치는 10을 먹습니다. 
 	public void hunt() {
		setHp(getHp() -1 );
		setExp(getExp()+10) ; 
		System.out.println("전사가 사냥을 합니다.");
		}
		// doubleAttack을 특수 스킬로 가지고 
		// 사용시 체력은 4씩 까지고 경험치는 25씩 증가합니다.
		public void doubleAttack () {
			setHp(getHp()- 4) ;
			setExp(getExp()+25);
			System.out.println("전사가 두 번 공격합니다.");
		}
		//getInfo는 Magician과 동일합니다.
		public void getInfo() {

			System.out.println("현재 체력 :" + getHp());
			System.out.println("현재 마나 :" + getMp());
			System.out.println("현재 레벨 :" + getLv());
			System.out.println("현재 경험치 :" + getExp());
			System.out.println("현재 유저명 :" + getName());
		}
	    //----------------
		//이렇게 만든다음 Main02.java를 이용해
		//전사를 생성해 각 스킬을 1번 이상 사용해보세요
		}

