import java.util.Scanner;
class Area

{
	public static void main(String[] args) 
	{
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enter value of radius");
	 float radius = sc.nextFloat();
	 final float pi = 22/7;
     float area = pi*(radius*radius);
     System.out.println("Area of circle is:"+area);
     float perimeter = 2*(pi*radius);
     System.out.println("Perimeter of Circle is:"+perimeter);
	}
}