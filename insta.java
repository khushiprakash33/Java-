package OOPS; //fetching a value from inst to local when having a same variable name

public class insta {
	int a=12;
	int b=12;
	void add(int a, int b)
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}
	
	public static void main(String[]args)
	{
		insta ff=new insta();
		ff.add(2,6);
	}
}
