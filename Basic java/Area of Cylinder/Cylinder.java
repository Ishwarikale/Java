import java.util.Scanner;
class Cylinder
{
	public static void main(String[] args)
	{
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the value of radius:");
     float radius =sc.nextFloat();
     final float pi = 22/7;
     float area = 2*(pi*(radius*radius));
     System.out.println("The area of cylinder is:"+area);
     System.out.print("Enter the value of height:");
     float height = sc.nextFloat();
     float volume = area*height;
     System.out.println("The volume of Cylinder is:"+volume);

	}
}
