import java.util.Scanner;
public class Sum
{
        public static void main(String[] args)
        {
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
                int res=sum(a);
                System.out.println(res);
        }
        public static int sum(int s)
        {
                if(s>0)
                {
                        return s+sum(s-1);
                }
                else
                {
                        return 0;
                }
        }
}