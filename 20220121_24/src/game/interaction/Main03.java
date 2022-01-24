package game.interaction;

public class Main03 {

	public static void main(String[] args) {
		Dragon d1 = new Dragon();
		Troll t1 = new Troll();
		
		Magician m1 = new Magician ();
		Archer a1 = new Archer();
		
		m1.huntDragon(d1);
		m1.huntDragon(d1);
		m1.huntDragon(d1);
		m1.huntDragon(d1);
	     System.out.println("-------------------");
	 	a1.huntTroll(t1);
	 	a1.huntTroll(t1);
	 	a1.huntTroll(t1);
	 	

	}

}
