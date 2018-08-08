package section1.subsection5;
class R
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(false)
		{
			System.out.println("if-block-stm1");
			System.out.println("if-block-stm2");
			int x = 10;
		}
		System.out.println("main end:" + x);
	}
}
