//Q19
/*

AAAAA
BBBB
CCC
DD
E

*/

class J
{
	public static void main(String[] args) 
	{
		for(char i = 'A'; i <= 'E'; i++)
		{
			for(char j = 'A'; j <= ('A' + 'E' - i); j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
