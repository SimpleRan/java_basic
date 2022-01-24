package game.interaction;

public class Troll {
	// orc와 유사한 몬스터를 2종 만들어서 
	// warrior가 사냥할 수 있도록 만들어주세요 
	// Main02.java에 2종 몬스터를 사냥한 결과를 화면에 보여주세요.
   
	private int hp;
	private int atk;
	
	public Troll() {
		this.hp = 10;
		this.atk = 5;
	}
	
	public void doBattle(int uAtk) {
		this.hp -= uAtk;
				System.out.println("트롤의 남은 체력 : " + this.hp);
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}
}