package section1.subsection3;
class V 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = i++   +   i   +   ++i   +  i   +   --i   +  i   +  i--   +  i;
		//       0        1        2       2        1       1      1        0
		System.out.println(i);
		System.out.println(j);
	}
}
