class Q62
{
	public static void main(String[] args) 
	{
		int rows = 7;
		char k = 'E';
		for(int i = 1; i <= rows; i++)
		{
			char m = (i <= (rows / 2) + 1) ? --k : ++k;
			if(i <= (rows / 2) + 1)
			{
				for(int j = 1; j <= (4 - i); j++)
				{
					System.out.print(" ");
				}
				for(int j = 1; j <= i; j++)
				{
					System.out.print(m++);
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
					System.out.print(m++);
				}
			}
			System.out.println();
		}
	}
}
