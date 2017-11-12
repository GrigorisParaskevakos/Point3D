package Demopack;

public class MyPoint3D extends MyPoint2D
{
	private int z;
	
	public MyPoint3D(int x, int y, int z)
	{
		super (x, y);
		this.z = z;
	}
	public void setz(int z)
	{
		this.z = z;
	}
	public int getz()
	{
		return z;
	}
	public void Dump()
	{
		super.Dump();
		System.out.printf(", %d", z);
	}
	
}
