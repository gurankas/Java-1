class Q57
{
	public static void main(String[] args) 
	{
		int rows = 7;
		char k = 'D';
		for(int i = 1; i <= rows; i++, k = 'D')
		{
			if(i <= (rows / 2) + 1)
			{
				for(int j = 1; j <= i; j++)
				{
					System.out.print(k--);
				}
			}
			else
			{
				for(int j = 1; j <= (rows + 1 - i); j++)
				{
					System.out.print(k--);
				}
			}
			System.out.println();
		}
	}
}
