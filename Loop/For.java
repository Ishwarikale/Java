class For 
{
	public static void main(String[] args) 
	{
		//1 to 10
		for(int i =1;i<=10;i++)
		{
			System.out.println(i);
		}
		// A to Z
		for(char ch = 'A';ch <='Z';ch++)
		{
			System.out.println(ch);
		}
		// z to a
		for(char ch = 'z';ch>='a';ch--)
		{
			System.out.println(ch);
		}
		// Digit 0 to 9
		for(char ch = '0';ch<='9';ch++)
		{
			System.out.println(ch);
		} 
		//ASCII VALUE
		for (int i =0;i<=127 ;i++ )
		{
			System.out.println(i+":"+((char)i));
		}
	}
}
