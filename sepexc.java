package OOPS;

public class sepexc {
	public static void main(String[]args)
	{
	try
	{
		
		System.out.println("start");
		int[]b= {10,20,30};
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		int a=10/0;
	}
	catch (ArithmeticException e) {
        System.out.println("Arithmetic Exception");
    }
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Array Exception");
    }
	catch(Exception e)
	{
		System.out.println("Exception hand");
	}
}

	

}
