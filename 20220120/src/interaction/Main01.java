package interaction;

public class Main01 {
	public static void main(String[] args) {
     // 판매자 하나 생성
	// 판매자 정보 조회
	Seller s1 = new Seller(50); 
	  s1.showSeller();
	// 구매자 하나 생성
	// 구매자 정보 조회
	Buyer b1 = new Buyer(100000);
	 b1.showBuyer();
	 
	// 구매자가 판매자를 지정해 망고 구매
	b1.buyMango(s1, 12);
	
	// 구매 후 판매자 정보 조회
	// 구매 후 구매자 정보 조회
	s1.showSeller();
	b1.showBuyer();
	
  }
}