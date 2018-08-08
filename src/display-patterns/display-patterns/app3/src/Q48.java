class Q48
{
	public static void main(String[] args) 
	{
		int rows = 4;
		for(int i = 1; i <= rows; i++)
		{
			for(int j = 1; j <= (i - 1); j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= (((rows - i)*2) + 1); j++)
			{
				System.out.print((rows - i + 1));
			}
			System.out.println();
		}
	}
}
