import java.util.*;
class Exp2_5
{
    public static void main(String args[])
    {
        int a[][]=new int[20][20];
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int r=o.nextInt();
        System.out.println("Enter the no. of columns");
        int c=o.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                a[i][j]=o.nextInt();
        int l=a[0][0];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                if(a[i][j]>l)
                    l=a[i][j];
        System.out.println("Largest : "+l);
    }
}