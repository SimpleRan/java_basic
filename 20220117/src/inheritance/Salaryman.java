package inheritance;
//person을 상속해서 salaryman을 만들어보세요
// 샐러리맨은 연봉(salary)를 가집니다
// getsalaryInfo()로 상태를 조회할 수 있습니다.

public class Salaryman extends Person {
  //추가 변수 (샐러리맨만 가지는 특성)
	public int Salary; //연봉
 
  public void getSalaryInfo() {
  System.out.println("이름 : " + name +", 나이 : "+ age + ", 연봉 :" + Salary);
 }
}
