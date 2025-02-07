import java.util.Scanner;
class ForUsername 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Username:");
		String st = sc.nextLine().toUpperCase();
         
        int len = st.length();
		for(int i =0;i<len;i++)
		{
			System.out.println(st.charAt(i)+":"+i);
		}
	}
}
