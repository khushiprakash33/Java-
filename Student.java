package basic;

public class Student {
	String name;
	int age;
	
	Student()
	{
		System.out.println("Khushi");
	}
	Student(int sem)
	{
		System.out.println("Khushi P "+  sem);
	}
	public static void main(String[]args)
	{
		Student s1= new Student();
		Student s= new Student(5);
		
	}

}
