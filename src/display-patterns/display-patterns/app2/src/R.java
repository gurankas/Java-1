//Q27
class R 
{
	public static void main(String[] args) 
	{
		for(char i = 'A'; i <= 'E'; i++)
		{
			for(char j = 'A'; j <= ('A' + 'E' - i - 1); j++)
			{
				System.out.print(" ");
			}
			for(char j = 'A'; j <= i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
