class Q44
{
	public static void main(String[] args) 
	{
		char c1 = 'A';
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= (5 - i); j++)
			{
				System.out.print(" ");
			}
			char c2 = c1++;
			for(int j = 1, k = (i - 1); j <= ((2*i) - 1); j++)
			{
				if(j < i)
				{
					System.out.print(c2--);
				}
				else
				{
					System.out.print(c2++);
				}
			}
			System.out.println();
		}
	}
}
