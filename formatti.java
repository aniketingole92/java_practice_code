class formatti
{
	public static void main(String [] args)
	{
		String name = "Angad";
		int age = 16;
		String msg = "%s is %d years old";
		System.out.println(String.format(msg,name,age));
	}
}
