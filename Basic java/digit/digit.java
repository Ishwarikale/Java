import java.util.Scanner;
class  digit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = sc.next().charAt(0);
		String ans = (ch>='0'&&ch<='9')?(ch+ "is a digit"):(ch+"is not a didgit");
		System.out.println(ans);
	}
}
