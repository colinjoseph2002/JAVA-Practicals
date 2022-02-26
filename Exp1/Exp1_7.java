import java.util.*;
class Exp1_7
{
    public static void main(String args[])
    {
        int a=0,b=1,c,n,i;
        System.out.println("Enter no. of elements");
        Scanner o=new Scanner(System.in);
        n=o.nextInt();
        System.out.println(a+" "+b);
        for(i=3;i<=n;i++)
        {
            c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
        }
    }
}