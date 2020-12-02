class metdemo2
{
	int s;

	int dis(int a, int b)
	{
		s= a+b;
		System.out.println("subtraction is " + s);
		return 0;
	}

	public static void main(String [] args)
	{
		System.out.println("add the no = " + Math.min(1,3));

		metdemo2 ss = new metdemo2();
		ss.dis(3,12);
		System.out.println("no is " + ss.dis(21,8));

	}

}