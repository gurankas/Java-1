package section1.subsection3;
class K 
{
	public static void main(String[] args) 
	{
		int x = 0;
int y = x++   +   x++    +   x   +   x--   +   x   +  x++   +   x   +  x--  +  x;
	//  0          1         2       2         1      1         2      2       1
		System.out.println(x + ", " + y);
	}
}
