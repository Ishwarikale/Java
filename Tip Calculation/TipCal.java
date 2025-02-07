import java.util.Scanner;
class TipCal 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill: ");
		float bill = sc.nextFloat();
		System.out.println("Tip rate:");
		float tiprate= sc.nextFloat();
		float tipAmount=(tiprate*bill)/100;
		float totalBill = bill+tipAmount;
		System.out.println("totalbill is:"+totalBill);
		System.out.println("Tip added is:"+tipAmount);
	}
}
