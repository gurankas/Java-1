//Q30
class U
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= (i - 1); j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= (6 - i); j++)
			{
				System.out.print((6 - i));
			}
			System.out.println();
		}
	}
}
