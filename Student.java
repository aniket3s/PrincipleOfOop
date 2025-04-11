package PricipleOfOop;

public class Student {
	
	private String instiuteName = "Qspider";
	private String name;
	private String course;
	private double fees;
	private String branch;
	private double cgpa;
	private String degree;
	private double sscPer;
	private double hscPer;
	private long phno;
	
	public Student(String name,String course,double fees, String branch,double cgpa,
					String degree, double sscPer, double hscPer, long phno)
	{
		this.name = name;
		this.course = course;
		this.fees = fees;
		this.branch = branch;
		this.cgpa = cgpa;
		this.degree = degree;
		this.sscPer = sscPer;
		this.hscPer = hscPer;
		this.phno = phno;	
	}
	
	public String getStudent()
	{
		return name;
	}
	
	public String getCourse()
	{
		return course;
	}
	public double getfees()
	{
		return fees;
	}
	 public void setFees(boolean permission, String branch)
	 {
		 if(permission)
		 {
			 this.branch = "Hadapsar";
		 }
		 else 
		 {
			System.out.println("please take the permission .. "); 
		 }
	 }
	 public double getCgpa()
	 {
		 return cgpa;
	 }
	 public String degree()
	 {
		 return degree;
	 }
	 public double sscPer()
	 {
		 return sscPer;
	 }
	 public double hscPer()
	 {
		 return hscPer;
	 }
	 public void setPhno(long phno, boolean id)
	 {
		 if (id)
		 {
			System.out.println("moobile number updated");
		 }
		 else 
		 {
			 System.out.println("please provide valid id proof ");
		 }
	 }
	 
}


















