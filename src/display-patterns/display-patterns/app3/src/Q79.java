class Q79
{
	public static void main(String[] args) 
	{
		int rows = 9;
		int middle = (rows / 2) + 1;
		char c1 = '@';
		for(int i = 1; i <= rows; i++)
		{
			if(i <= middle)
			{
				c1 ++;
				for(int j = 1; j <= (middle - i); j++)
				{
					System.out.print(" ");
				}
				for(int j = 1; j <= i; j++)
				{
					System.out.print(c1 + " ");
				}
			}
			else
			{
				c1--;
				for(int j = 1; j <= (i - middle); j++)
				{
					System.out.print(" ");
				}
				for(int j = 1; j <= (rows + 1 - i); j++)
				{
					System.out.print(c1 + " ");
				}
			}
			System.out.println();
		}
	}
}
