package OOPS;

public class delete {
	public static void main(String[]args)
	{
		StringBuilder name=new StringBuilder("Java is programming");
		System.out.println(name.delete(5,6));
		
		StringBuilder subject=new StringBuilder("Maths");
		System.out.println(subject.deleteCharAt(4));
	}

}
