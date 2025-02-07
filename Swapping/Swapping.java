class Swapping
{
	public static void main(String[] args)
	{
		int a = 2;
		int b = 4;
		System.out.println("BEFORE SWAPPING");
		System.out.println("a:"+a);
		System.out.println("b:"+b);

		int temp = a;
		a = b;
		b = temp;
		System.out.println("AFTER SWAPPING");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		//WITHOUT USING THIRD VARIABLE 
		int c = 6;
		int d = 4;
		System.out.println("BEFORE SWAPPING");
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		c = c+d;
		d = c-d;
		c = c-d;
		System.out.println("AFTER SWAPPING WITHOUT USING THIRD VARIABLE");
		System.out.println("c:"+c);
		System.out.println("d:"+d);
	}
}

