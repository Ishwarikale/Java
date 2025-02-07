import java.util.Scanner;
class Rectangle{
	 public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of width:");
		float width = sc.nextFloat();
		System.out.println("Enter the value of height:");
		float height = sc.nextFloat();
		float area = width*height;
		float perimeter = 2*(width*height);
		System.out.println("The Area of rectangle is:"+area);
		System.out.println("The Perimeter of reactangle is:"+perimeter);

	}
}