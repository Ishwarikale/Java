import java.util.Scanner;
class MONTHS
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month");
		String month = sc.next().toUpperCase();
        String ans = 
			(month.equals("OCT"))||(month.equals("NOV"))||
			(month.equals("DEC"))||(month.equals("JAN"))? month+"is WINTER":
			(month.equals("FEB"))||(month.equals("MARCH"))||
			(month.equals("APRIL"))||(month.equals("MAY"))?month+"is SUMMER":
			(month.equals("JUNE"))||(month.equals("JULY"))||
			(month.equals("AUGUST"))||(month.equals("SEP"))?month+"is MONSOON":
			"INVALID MONTH";
		System.out.println(ans);
	}
}
