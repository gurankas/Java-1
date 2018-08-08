package section1.subsection3;
class J 
{
	public static void main(String[] args) 
	{
		int x = 5;
		int y = x--  +   x--   +   x--   +  x--   +   x;
		//      5        4         3        2         1
		System.out.println(x);
		System.out.println(y);
	}
}
