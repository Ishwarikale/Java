import java.util.Scanner;
class ForVowel 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Username:");
		String st = sc.nextLine().toUpperCase();
		int len = st.length();
		for(int i =0;i<len;i++){
			if(st.charAt(i)=='a'||st.charAt(i)=='A'||st.charAt(i)=='e'||st.charAt(i)=='E'||st.charAt(i)=='i'||st.charAt(i)=='I'||
				st.charAt(i)=='o'||st.charAt(i)=='O'||st.charAt(i)=='u'||st.charAt(i)=='U')
				System.out.println(st.charAt(i)+" "+i);
		}
		}
}
