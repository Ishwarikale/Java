import java.util.Scanner;
class IF 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you a paid Student");
		  boolean ip = sc.nextBoolean();
		if(ip)
		{
		System.out.println("Pay the Fee");
		}
		System.out.println("Do the class");
	}
}
