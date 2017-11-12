/*Paraskevakos G.*/


package Demopack;
import java.util.Scanner;


public class MyPointsTest 
{

	public static void main(String[] atgs)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		MyPoint point =new MyPoint(0);
		
		MyPoint2D point2D = new MyPoint2D(0,1);
		
		MyPoint3D point3D = new MyPoint3D(3,1,1);
		
		System.out.println("give 3D point: ");
		int p1 = in.nextInt();
		int p2 = in.nextInt();
		int p3 = in.nextInt();
		
		point.setx(p1);
		
		point2D.setx(p1);
		point2D.sety(p2);
		
		point3D.setx(p1);
		point3D.sety(p2);
		point3D.setz(p3);
		
		
		/*point.Dump();
		System.out.println();
		point2D.Dump();
		System.out.println();
		point3D.Dump();
		System.out.println();
		*/
		
		// OR
		
		System.out.printf("%s %d, %d, %d\n","Σημείο 3D: ", point.getx(), point2D.gety(), point3D.getz());
		
		
	}
}
