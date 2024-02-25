import java.util.Scanner;
public class Main
{
    static int Binary_search(int a[],int n,int element)
    {
        int l=0,r=n-1;
       
        while(l<=r)
        {
             int mid=(l+r)/2;
        if(element==a[mid])
        {
            return mid;
        }
        else if(element < a[mid])
        {
            r=mid-1;
        }
        else
        {
            l=mid+1;
        }
    }
    return -1;
    }
	public static void main(String[] args) {
	int n;
	System.out.print("Enter the size of array:");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    int element;
    System.out.print("Enter element:");
    element=sc.nextInt();
    int res=Binary_search(a,n,element);
    if(res==-1)
    {
        System.out.print("Element not found");
    }
    else
    {
        System.out.print("Element found at index"+res);
    }
	}
}
