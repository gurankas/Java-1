package section1.subsection5;
class N
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int x = 10;
		if(x++ == 10 || x++ == 11)
		{
			System.out.println("if-block-stm1");
			System.out.println("if-block-stm2");
			x++;
		}
		System.out.println("main end:" + x);
	}
}
