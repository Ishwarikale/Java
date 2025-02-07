import java.util.Scanner;
class PassFail 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks:");
		float mark= sc.nextFloat();
        float percentage = (mark/600)*100;
		String ans = (percentage>=75)?"Grade A with "+percentage+"%":
					 (percentage>=60)?"Grade B with "+percentage+"%":
					 (percentage>=35)?"Grade C with "+percentage+"%":
					 "FAILED";
		System.out.println(ans);
	}
}
