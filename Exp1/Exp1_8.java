import java.util.*;
class Exp1_8
{
    public static void main(String argu[])
    {
        int a,fact=1,i;
        System.out.println("Enter the number");
        Scanner c=new Scanner(System.in);
        a=c.nextInt();
        for(i=1;i<=a;i++)
            fact=fact*i;
        System.out.println("Factorial= " + fact);
    }
}