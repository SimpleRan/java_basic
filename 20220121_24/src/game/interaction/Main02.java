package game.interaction;

public class Main02 {
public static void main(String[] args) {
	
	Dragon d1 = new Dragon();
	Troll t1 = new Troll();
	
	Warrior w1 = new Warrior ();
	w1.huntDragon(d1);
	w1.huntDragon(d1);
	w1.huntDragon(d1);
	w1.huntDragon(d1);
     System.out.println("-------------------");
 	w1.huntTroll(t1);
 	w1.huntTroll(t1);
 	w1.huntTroll(t1);
 	w1.huntTroll(t1);
}
}
