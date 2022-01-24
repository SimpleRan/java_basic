package game.interaction;

public class Dragon {

	    
		private int hp;
		private int atk;
		
		public Dragon() {
			this.hp = 15;
			this.atk = 7;
		}
		
		public void doBattle(int uAtk) {
			this.hp -= uAtk;
					System.out.println("드래곤의 남은 체력 : " + this.hp);
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
