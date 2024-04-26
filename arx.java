import java.util.Scanner;
class Search{
    public void linearsearch(arr,key)
    {
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]==key)
        	{
        		System.out.println("Element found at Index"+i);
        		return;
        	}
        }
        System.out.println("Element not found in the array");
    }

    public void Binarysearch(arr,element)
    {
    	while(l<=r)
    	{
    		
    	}
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int[] arr;
        System.out.println("MENU DRIVEN ARRAY SORT- SEARCH PROGRAM");
        System.out.println("ALGORITHM       -   Time Complexity");
        System.out.println("1.) Linear Search - O(n)");
        System.out.println("2.) Binary Search - O(logn)");
        System.out.println("3.) Bubble sort - O(n^2)");
        System.out.println("4.) Selection sort - O(n^2)");
        System.out.println("5.) Insertion Sort - O(n^2)");
        System.out.println("6.) Merge Sort - O(n logn)");
        System.out.println("7.) Radix sort - O(nk)");
        do{
        System.out.println("Enter the size of the array:");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter"+n+"elements in an array:");        
        for(int i=1;i,n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int choice=sc.nextInt();
        Search se = new Search();
        switch(choice)
        {
            case 1:
                System.out.println("Searching Algorithm : Linear Search")
                System.out.println("Enter the Key to search:");
                int key=sc.nextInt();
                se.linearSearch(arr,key);

             case 2:
             System.out.println("Searching Algorithm : Binary Search")
             
                
        }
        
        }

        
        
        
    }
}
