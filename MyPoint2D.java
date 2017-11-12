package Demopack;

public class MyPoint2D extends MyPoint
{
	private int y;
	
	public MyPoint2D(int x, int y)
	{
		super (x);
		this.y = y;
	}
	public void sety(int y)
	{
		this.y = y;
	}
	public int gety()
	{
		return y;
	}
	public void Dump()
	{
		super.Dump();
		System.out.printf(", %d", y);
	}
}
