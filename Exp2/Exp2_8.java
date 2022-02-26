import java.util.*;
class Exp2_8
{
    public static void main(String args[])
    {
        int i,j;
        Scanner o=new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int r=o.nextInt();
        System.out.println("Enter the no. of columns:");
        int c=o.nextInt();
        int a[][]=new int[20][20];
        int b[][]=new int[20][20];
        int R[][]=new int[20][20];
        System.out.println("Enter elements of matrix");
        for(i=0;i<r;i++)
            for(j=0;j<c;j++)
                a[i][j]=o.nextInt();
        System.out.println("Enter no.of rows in 2nd matrix: ");
        int x=o.nextInt();
        System.out.println("Enter the no. of columns in 2nd matrix: ");
        int y=o.nextInt();
        System.out.println("Enter elements of 2nd matrix: ");
        for(i=0;i<x;i++)
            for(j=0;j<y;j++)
                b[i][j]=o.nextInt();
        if(c==x)
        {
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    R[i][j]=0;
                    for(int k=0;k<c;k++)
                        R[i][j]+=a[i][j]*b[k][j];
                }
            }
            System.out.println("Result is : ");
            for(i=0;i<r;i++)
                for(j=0;j<y;j++)
                    System.out.println(R[i][j]+"\t");
                System.out.println("\n");
        }
        else
        System.out.println("Matrix can't be multiplied");
    }
}