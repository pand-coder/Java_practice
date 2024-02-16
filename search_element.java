import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		int n;
		System.out.println("Enter number of elements:");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.print("Enter the Search element:");
		int element=in.nextInt();
		int index=-1;
		for(int i=0;i<=n;i++)
		{
			if(arr[i]==element)
			{
				index=i;
				break;
			}
		}
		System.out.print(index);
	}
}
