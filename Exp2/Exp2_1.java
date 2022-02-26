import java.util.*;
class Exp2_1
{
    public static void main(String args[])
    {
        System.out.println("Enter array limit : ");
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        int a[]=new int[n];
        int sum=0;
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            a[i]=o.nextInt();
            sum=sum+a[i];
        }
         System.out.println("Sum of elements= " +sum);
    }
}