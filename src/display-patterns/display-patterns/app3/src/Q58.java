class Q58
{
	public static void main(String[] args) 
	{
		int rows = 7;
		char k = 'E', m;
		for(int i = 1; i <= rows; i++)
		{
			m = (i <= 4) ? --k : ++k;
			if(i <= (rows / 2) + 1)
			{
				for(int j = 1; j <= i; j++)
				{
					System.out.print(m++);
				}
			}
			else
			{
				for(int j = 1; j <= (rows + 1 - i); j++)
				{
					System.out.print(m++);
				}
			}
			System.out.println();
		}
	}
}
