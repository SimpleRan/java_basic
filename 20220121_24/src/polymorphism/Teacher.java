package polymorphism;
// 여러분들이 다향성을 적용해 Person을 상속받는 클래스를 2개 더 만들어주세요 
// 직업은 마음대로 선정해 만들어주세요

// main02P302에서 둘 다 만들어서 호출하시되, 받는 변수 자료형은 무조건 Person으로 작성합니다
// 그리고 메모리그림을 그려서 제출해주세요.
public class Teacher extends Person {

 private String Subject;
 public Teacher (String name, int age, String subject) {	
		super(name, age);
		this.Subject = subject;
 }
}