package OOPS;

public class Demostr
{
	private String A;
    public String getA() {
		return A;
	}
    public void setA(String a) {
		A = a;
	}



class Demo extends Demostr
{
	public static void main(String[]args)
	{
		Demostr bb=new Demostr();
		bb.setA("khushi");
		String ss=bb.getA();
		System.out.println(ss);
		
	}
}
}
