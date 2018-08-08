package section1.subsection4;
class H 
{
	public static void main(String[] args) 
	{
		int x = 0;
		boolean b1 = true || (x++ == 0);
		System.out.println(b1);
		System.out.println(x);
	}
}
