class Q56
{
	public static void main(String[] args) 
	{
		int rows = 7;
		for(int i = 1, k; i <= rows; i++)
		{
			k = (i <= 4) ? (4 - i) : (i - 4);
			if(i <= (rows / 2) + 1)
			{
				for(int j = 1; j <= i; j++)
				{
					System.out.print(k++);
				}
			}
			else
			{
				for(int j = 1; j <= (rows + 1 - i); j++)
				{
					System.out.print(k++);
				}
			}
			System.out.println();
		}
	}
}
