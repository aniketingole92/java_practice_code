import java.util.Scanner;
class arr 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int size = sc.nextInt();
		System.out.println(size);
	 
		int index = 0 ;
		int [] num_seq = new int[size];
		while (index < size)
	{
		num_seq [index] = sc.nextInt();
		index = index + 1;
	}
	
	for (int each_item: num_seq)
	{
		int square = each_item * each_item;
		System.out.print(square + " ");
	}
	}
}

		
