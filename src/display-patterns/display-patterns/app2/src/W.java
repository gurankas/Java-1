//Q32
class W
{
	public static void main(String[] args) 
	{
		for(char i = 'E'; i >= 'A'; i--)
		{
			for(char j = 'A'; j <= ('A' + 'E' - i - 1); j++)
			{
				System.out.print(" ");
			}
			for(char j = 'E'; j >= ('E' + 'A' - i); j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
