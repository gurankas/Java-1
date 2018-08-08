package section1.subsection4;
class I 
{
	public static void main(String[] args) 
	{
		int x = 0;
		boolean b1 = false || (x++ == 0);
		System.out.println(x);
		System.out.println(b1);
	}
}
