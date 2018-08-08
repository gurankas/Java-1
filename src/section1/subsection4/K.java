package section1.subsection4;
class K 
{
	public static void main(String[] args) 
	{
		int x = 0;
		boolean b1 = (x++ == 1) || (x++ == 1);
		System.out.println(b1);
		System.out.println(x);
	}
}
