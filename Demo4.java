package OOPS;

public class Demo4 
{
//byte , sort  short char long int float double
public static void main(String[] args) {

///	Demo d1 = new Demo()

	String s1 = new String("Hello");
	String s2 = new String("Hello");
	if (s1 == s2) {
		System.out.println("s");
	} else {
		System.out.println("n");

	}
	if (s1.equals(s2)) {
		System.out.println("s");
	} else {

		System.out.println("n");
	}
	
	String s3 = "Hello";
	String s4 ="Hello";
	System.out.println("--------------");
	if (s3 == s4) {
		System.out.println("Yes ");
	} else {
		System.out.println("No");

	}
	if (s3.equals(s4)) {
		System.out.println("Yes");
	} else {

		System.out.println("--------------");
		System.out.println("No");
	}
	System.out.println(s1);
	System.out.println(s2);
	int a = 3;

}
}


