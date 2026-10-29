package OOPS;

public class Arrexce {
	public static void main(String[]args)
	{
	try
	{
		
		System.out.println("start");
		int[]b= {10,20,30};
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		int a=10/0;
	}
	catch(Exception e)
	{
		System.out.println("Exception hand");
	}
}


}
