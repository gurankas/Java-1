class Q54
{
	public static void main(String[] args) 
	{
		int rows = 7;
		for(int i = 1; i <= rows; i++)
		{
			if(i <= (rows / 2) + 1)
			{
				for(int j = 1; j <= i; j++)
				{
					System.out.print("*");
				}
			}
			else
			{
				for(int j = 1; j <= (rows + 1 - i); j++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
