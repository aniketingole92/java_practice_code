class formatt
{
	public static void main(String[] args)
	{
		String name = "Aniket";
		int age = 20;
		String msg = "%s is %d years old";
		System.out.println(String.format(msg,name,age));
	}
	
}
