package section1.subsection3;
class S 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = ++i  +  i  +  ++i  +  i;
		//       1      1      2      2
		System.out.println(i);
		System.out.println(j);
	}
}
