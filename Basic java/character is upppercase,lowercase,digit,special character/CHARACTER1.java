import java.util.Scanner;
class CHARACTER1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A CHARACTER:");
		char ch = sc.next().charAt(0);
		String op=(ch>='A'&& ch<='Z'||ch>='a'&& ch<='z')?((ch>='A'&& ch<='Z')?(ch+ "is an Uppercase Alphabet"):(ch+ "is a Lowercase Alphabet")):((ch>='0'&& ch<='9')?(ch+"is an digit"):(ch+"is an special character"));
		System.out.println(op);
		System.out.println("ENTER A CHARACTER:");
		char ch1 = sc.next().charAt(0);
		String ans = (ch1>='A'&& ch1<='Z')?(ch1+"is a uppercase"):((ch1>='a'&&ch1<='z')?(ch1+ "is lowercase"):((ch1>='0'&&ch1<='9')?(ch1+"is a didgit"):(ch1+ "is a special character")));
		System.out.print(ans);
	}
}
