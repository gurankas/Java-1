class Q73
{
	public static void main(String[] args) 
	{
		int rows = 5;
		char c1 = 'E';
		for(int i = 1; i <= rows; i++, c1--)
		{
			for(int j = 1; j <= (i - 1); j++)
			{
				System.out.print(" ");
			}
			char c2 = c1;
			for(int j = 1; j <= (rows + 1 - i); j++)
			{
				System.out.print((c2--) + " ");
			}
			System.out.println();
		}
	}
}
