class Q45
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= (5 - i); j++)
			{
				System.out.print(" ");
			}
			for(int j = 1, k = 1; j <= ((2*i) - 1); j++)
			{
				if(j < i)
				{
					System.out.print(k++);
				}
				else
				{
					System.out.print(k--);
				}
			}
			System.out.println();
		}
	}
}
