package section1.subsection4;
class P 
{
	public static void main(String[] args) 
	{
		int i = 0;
		boolean b1 = false;
		boolean b2 = !b1 || (i++ == 0);
		System.out.println(i);
		System.out.println(b1);
		System.out.println(b2);
	}
}
