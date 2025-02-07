import java.util.Scanner;
class Celsius{
	 public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of degree in Celsius:");
		double Celsius = sc.nextDouble();
		double Fahrenheit = (9.0/5)*Celsius+32;
		System.out.println("The value in Fahrenheit is:"+Fahrenheit);
	}
}