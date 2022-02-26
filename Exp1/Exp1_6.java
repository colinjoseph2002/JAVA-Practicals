import java.util.*;
class Exp1_6
{
    public static void main(String args[])
    {
        int a,i;
        System.out.println("Enter the number");
        Scanner c=new Scanner(System.in);
        a=c.nextInt();
        for(i=1;i<=a;i++)
            if(a%i==0)
                System.out.println(i);
    }
}