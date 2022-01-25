package game.polymophism;

public class Monster {
    //hp, atk을 변수(필드, 속성)로 가집니다. 
	private int atk;
    private int hp;
    private String name;//몬스터 이름
    private int exp; // 몬스터 경험치

    // 생성자까지 만들어주세요.
    // 체력과 공격력이 몬스터별로 다 달라야 하니 입력받게 해주세요.
    public Monster (int hp, int atk, String name, int exp) {
    	this.hp = hp;
    	this.atk = atk; 
    	this.name = name;
    	this.exp = exp;
    	
    }
   // doBattle(int)를 생성해주세요.
    // 사용자의 공격력 uAtk만큼 몬스터의 체력이 깎입니다. 
    // 체력이 0이되면 몬스터와 교전이 뷸가능하다는 메세지를 남겨줍니다. 
    // 체력이 0보다 높으면 남은 체력을 마지막 콘솔창에 띄워줍니다. 
      public void doBattle(int uAtk ) {
    	  this.hp -= uAtk;
    	  System.out.println(this.name + "(이/가) 공격을 받았습니다.");
    	  System.out.println("체력이 " + this.hp + "남았습니다.");
      }
      //현재 몬스터와 교전시 몬스터 종류가 안나오고 그냥 "몬스터"라고만 지칭됩니다. 
      // 몬스터와 교전했을 때 몬스터 종류가 나오도록 Monster 쪽 코드를 고쳐주세요.
      // 그리고 경험치 수치도 나오도록 고쳐주세요.
      //( 변수, 메서드를 모두 고쳐주거나 추가해야함)
      
      // getter/setter 를 생성해주세요
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
      
      
     

}