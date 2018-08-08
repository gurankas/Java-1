class Q51
{
	public static void main(String[] args) 
	{
		int rows = 4;
		char c1 = 'D';
		for(int i = 1; i <= rows; i++, c1--)
		{
			for(int j = 1; j <= (i - 1); j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= (((rows - i)*2) + 1); j++)
			{
				System.out.print(c1);
			}
			System.out.println();
		}
	}
}
