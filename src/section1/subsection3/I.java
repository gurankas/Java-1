package section1.subsection3;
class I 
{
	public static void main(String[] args) 
	{
		int x = 5;
		int y = x--   +   x   +   x--   +   x   +   x--   +   x;
		//      5         4        4        3       3         2
		System.out.println(x);
		System.out.println(y);
	}
}
