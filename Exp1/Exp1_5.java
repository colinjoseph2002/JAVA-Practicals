import java.util.*;
class Exp1_5
{
    public static void main(String args[])
    {
        int i,n,sum=0;
        System.out.println("Enter a number");
        Scanner c=new Scanner(System.in);
        n=c.nextInt();
        for(i=1;i<=n;i++)
        sum=sum+i;
        System.out.println("Sum of "+n+" natural number = "+sum);
    }
}