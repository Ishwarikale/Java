import java.util.Scanner;
class Character
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = sc.next().charAt(0);
		String ans=(ch>=65&&ch<='Z')?(ch+"IT IS UPPERCASE ALPHABET"):(ch+"NOT AN UPPERCASE ALPHABET");
		System.out.println(ans);
		System.out.println("Enter the Character");
		char lower1 = sc.next().charAt(0);
		String lower =(lower1>='a'&&lower1<='z')?(ch+ "is a lowercase character"):(ch+"is not a lowercase character");
		System.out.println(lower);
	}
}
