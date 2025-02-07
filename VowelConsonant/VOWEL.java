import java.util.Scanner;
class VOWEL 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = sc.next().charAt(0);
		String ans = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?(ch+ "is vowel"):(ch+ "is consonant");
		System.out.println(ans);
	}
}