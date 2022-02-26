import java.util.*;
public class ReplaceArrayElement
{
    

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array limit: ");
        int n=sc.nextInt(),a[]=new int[n];
        System.out.println("Enter "+n+" Elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array before replacing element");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Enter position(index varies from 0 to "+(n-1)+") of element to be replaced");
        int p=sc.nextInt()/*dup=a[p]*/;
        System.out.println("Enter element to be replaced");
        a[p]=sc.nextInt();
        System.out.println("Array after replacing "+ a[p]);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}