package inheritance;

public class Main02P254 {

	public static void main(String[] args) {
		//여기에 학생 하나와 샐러리맨 하나를 임의로 만들어보세요.
		// 샐러리맨에는 본인 이름과 희망 연봉을 적어주세요
		// 학생은 그냥 알아서 작성해주세요
		// 생성한 객채의 정보를 get~~Info()를 이용해 콘솔에도 같이 작성해주세요.
		
   Student s1 = new Student ();
		   s1.name = "뫄뫄" ;
		   s1.age = 15;
		   s1.stuNum = 123;
		   
		   s1.getstuInfo();
		   
		   Salaryman sm1 = new Salaryman ();
	       sm1.name = "나님";
	       sm1.age = 30;
	       sm1.Salary = 200000000 ;
	       
	       sm1.getSalaryInfo();
	       
	      
	}

}
