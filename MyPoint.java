package Demopack;

public class MyPoint 
{
	private  int x;
	
	public MyPoint(int x)//constructor
	{
		this.x = x;
	}
	
	public void setx(int x)
	{
		this.x = x;
	}
	public int getx()
	{
		return x;
	}
	public void Dump()
	{
		System.out.printf("Σημείο:  %d", x);
	}
}
