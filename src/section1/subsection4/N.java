package section1.subsection4;
class N 
{
	public static void main(String[] args) 
	{
		int i = 0;
		boolean b1 = (i++ == 0) && (i++ == 1);
		System.out.println(b1);
		System.out.println(i);
	}
}
