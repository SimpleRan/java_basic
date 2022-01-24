package polymorphism;

public class Doctor extends Person {
	private String Major;

	public Doctor(String name, int age, String major) {
		super(name, age);
		this.Major = major;
		
	}
	 
}
