class Q60
{
	public static void main(String[] args) 
	{
		int rows = 7;
		for(int i = 1, k = 3; i <= rows; i++, k = 3)
		{
			if(i <= (rows / 2) + 1)
			{
				for(int j = 1; j <= (4 - i); j++)
				{
					System.out.print(" ");
				}
				for(int j = 1; j <= i; j++)
				{
					System.out.print(k--);
				}
			}
			else
			{
				for(int j = 1; j <= (i - 4); j++)
				{
					System.out.print(" ");
				}
				for(int j = 1; j <= (rows + 1 - i); j++)
				{
					System.out.print(k--);
				}
			}
			System.out.println();
		}
	}
}
