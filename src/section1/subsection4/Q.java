package section1.subsection4;
class Q 
{
	public static void main(String[] args) 
	{
		int i = 0;
		boolean b1 = true;
		boolean b2 = (b1 == false) || (i++ == 0);
		System.out.println(i);
		System.out.println(b1);
		System.out.println(b2);
	}
}
