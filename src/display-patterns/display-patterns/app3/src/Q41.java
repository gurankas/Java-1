class Q41
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= (5 - i); j++)
			{
				System.out.print(" ");
			}
			char c1 = 'A';
			for(int j = 1; j <= ((2*i) - 1); j++, c1++)
			{
				System.out.print(c1);
			}
			System.out.println();
		}
	}
}
