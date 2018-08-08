//Q23
/*

EEEEE
DDDD
CCC
BB
A

*/

class N
{
	public static void main(String[] args) 
	{
		for(char i = 'E'; i >= 'A'; i--)
		{
			for(char j = 'E'; j >= ('A' + 'E' - i); j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
