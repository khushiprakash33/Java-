package OOPS;

//
interface Store
{
	void add();
}
class Inteface implements Store
{

	@Override
	public void add() 
	{
		System.out.println("khushi");
	}
	public static void main(String[]args)
	{
			Inteface bb=new Inteface();
			bb.add();
	}
	
	

}
