import java.util.*;
class Exp2_2
{
    public static void main(String args[])
    {
        int x,n;
        System.out.println("Enter array size: ");
        Scanner o=new Scanner(System.in);
        n=o.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
            a[i]=o.nextInt();
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                if(a[i]>a[j])
                {
                    x=a[i];
                    a[i]=a[j];
                    a[j]=x;
                }
        System.out.println("Smaller no : "+a[0]);
    }
}