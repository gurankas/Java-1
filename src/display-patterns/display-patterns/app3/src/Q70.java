class Q70
{
	public static void main(String[] args) 
	{
		int rows = 5;
		for(int i = 1; i <= rows; i++)
		{
			for(int j = 1; j <= (i - 1); j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= (rows + 1 - i); j++)
			{
				System.out.print((rows + 1 - i) + " ");
			}
			System.out.println();
		}
	}
}
