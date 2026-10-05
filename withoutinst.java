package OOPS; // can directly fetch the value if variables are different

public class withoutinst {
	int a=3;
	int b=5;
	void add(int c, int d)
	{
		System.out.println(a+b);
		System.out.println(c+d);
	}
	public static void main(String[]args)
	{
		withoutinst ff=new withoutinst();
		ff.add(2,3);
	}
}
