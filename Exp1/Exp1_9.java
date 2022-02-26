import java.util.*;
class Exp1_9
{
    public static void main(String args[])
    {
        int a,sum=0,d,x;
        System.out.println("Enter the number");
        Scanner c=new Scanner(System.in);
        a=c.nextInt();
        x=a;
        while(a!=0)
        {
            d=a%10;
            sum=sum+(d*d*d);
            a=a/10;
        }
        if(sum==x)
            System.out.println("The number is  Armstrong");
        else
            System.out.println("The number is not Armstrong");
    }
}