import java.util.*;
public class SecondLargestElement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array limit");
        int n=sc.nextInt(),a[]=new int[n], large=0,secondlargest=0;
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        large=secondlargest=0;
        for(int i=0;i<n;i++)
        {
            large=Math.max(large,a[i]);
        }
        for(int i=0; i<n;i++)
        {
            if(a[i]!=large)
            secondlargest=Math.max(secondlargest,a[i]);
        }
        System.out.println("Second Largest: "+ secondlargest);
        System.out.println("Largest: "+large);
        sc.close();
    }
}