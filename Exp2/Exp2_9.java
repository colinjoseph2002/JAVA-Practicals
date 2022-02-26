import java.util.*;
public class TraceofMatrix //Trace is the sum of main diagonal elements in a matrix.
{
  public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("\nEnter number of rows of first matrix:");
        int row=sc.nextInt();
        System.out.print("\nEnter number of columns of first matrix:");
        int column=sc.nextInt();
        int a[][]=new int [row][column];
        double sum=0.0d;
        System.out.println("Input the"+row+"\u00D7"+column+" Matrix");
        for(int i=0; i<row;i++)
            for(int j=0;j<column;j++)
                a[i][j]=sc.nextInt();      
        for(int i=0;i<row;i++)
                for(int j=0;j<column;j++)
                    if(i==j)
                        sum=sum+a[i][j];        
        System.out.println("\nThe " +row +"\u00D7" + column+" Matrix's trace is: "+ sum);
        sc.close();
    }
}