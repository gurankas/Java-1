class Q77
{
	public static void main(String[] args) 
	{
		int rows = 9;
		int middle = (rows / 2) + 1;
		for(int i = 1; i <= rows; i++)
		{
			if(i <= middle)
			{
				for(int j = 1; j <= (middle - i); j++)
				{
					System.out.print(" ");
				}
				for(int j = 1; j <= i; j++)
				{
					System.out.print(j + " ");
				}
			}
			else
			{
				for(int j = 1; j <= (i - middle); j++)
				{
					System.out.print(" ");
				}
				for(int j = 1, k = (i + 1 - middle); j <= (rows + 1 - i); j++, k++)
				{
					System.out.print(k + " ");
				}
			}
			System.out.println();
		}
	}
}
