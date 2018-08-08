class Q68
{
	public static void main(String[] args) 
	{
		int rows = 5;
		char m = 'A';
		for(int i = 1; i <= rows; i++, m = 'A')
		{
			for(int j = 1; j <= (rows - i); j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print(m++  +  " ");
			}
			System.out.println();
		}
	}
}
