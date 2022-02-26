import java.util.*;
class Exp1_4
{
    public static void main(String args[])
    {
        int a,flag=1;
        System.out.println("Enter the number");
        Scanner c=new Scanner(System.in);
        a=c.nextInt();
        for(int i=2;i<=a/2;i++)
        {
            if(a%i==0)
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
            System.out.println(a+" is prime");
        else
            System.out.println(a+" is not prime");
    }
}