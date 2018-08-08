package section1.subsection3;
class H 
{
	public static void main(String[] args) 
	{
		int x = 0;
		int y = x++  +   x++   +   x++   +   x++   +  x;
		//       0        1         2         3       4
		System.out.println(x);
		System.out.println(y);
	}
}
