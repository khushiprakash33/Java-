package OOPS;//method overloading
//same method different parameters within the class

public class Demo
{ //class
	void add(String s) //method name
	{
		System.out.println("string"); 
	}
	void add(int a)
	{
		System.out.println("integer");
	}
	public static void main(String[]args)
	{
		Demo tt=new Demo();
		tt.add("khushi");
		tt.add(5);
	}
}
