package structure;

public class CalssMain01P196 {

	//PersonClass를 조회할 메서드는 작성할 필요가 없습니다.
	// 이미 PersonClass 내부에 필요한 메서드를 작성해놨기 때문입니다. 
	
	public static void main(String[] args) {
		// 사람을 두명 만들어 보세요 (PersonClass)
     PersonClass p1 = new PersonClass();
     p1.age = 10; 
     p1.glasses = true ;
     p1.name = "채종훈";
     p1.pNum = "01012345678";
     p1.uNum = 2;		
     
     PersonClass p2 = new PersonClass();
     p2.age = 20; 
     p2.glasses = false ;
     p2.name = "채미나";
     p2.pNum = "010456745711";
     p2.uNum = 8;		
    
     // *힌트 getInfo의 소속은? 
      p1.getInfo();
      p2.getInfo();
	}

}
