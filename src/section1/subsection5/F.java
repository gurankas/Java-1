package section1.subsection5;
class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		boolean b1 = true;
		if(!b1)
		{
			System.out.println("if-block-stm1");
			System.out.println("if-block-stm2");
		}
		System.out.println("main end:" + b1);
	}
}
