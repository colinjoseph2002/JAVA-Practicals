import java.util.*;
public class TransposeMatrix 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("\nEnter number of rows:");
        int n=sc.nextInt();
        System.out.print("\nEnter number of columns:");
        int m=sc.nextInt();
        int original[][]=new int [n][m];
        int transpose[][]=new int [n][m];
        System.out.println("Input "+n+"\u00D7"+m+" Matrix");
        for(int i=0; i<n;i++)
            for(int j=0;j<m;j++)
                original[i][j]=sc.nextInt();
        System.out.println("The Transpose Matrix is:");
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                transpose[i][j]=original[j][i];
        for(int i=0; i<n;i++)
            for(int j=0;j<m;j++)
                System.out.print(transpose[i][j]+" ");
            System.out.println();
        sc.close();
    }
}
