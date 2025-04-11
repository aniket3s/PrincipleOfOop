package PricipleOfOop;

public class StudentDriver {
	
	public static void main(String[] args)
	{
		Student s1 = new Student("aniket", "JAVA ", 9000, "Deccan", 7.8, "BE", 93.60, 82.33, 987654l);
		
		System.out.println(s1.getCourse());
		System.out.println(s1.getCgpa());
	}
}
