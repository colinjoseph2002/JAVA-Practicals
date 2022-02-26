import java.util.*;
public class Exp3_2 
{
    int factorial(int a)
    { 
        int fact=1;
        if(a==0)
            fact=1;
        else if(a<0)
            fact=-1;
        else
        {
            for(int i=a;i>0;i--)
            {
                fact*=i;
            }
        }
        return fact;
    }
    int dig_Sum(int a)
    {
        int d,sum=0;
        if(a==0)
            sum=0;
        else if(a<0)
            sum=-1;
        else
        {
            while(a!=0)
            {
                d=a%10;
                sum+=d;
                a=a/10;
            }
        }
        return sum;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Exp3_2 ob=new Exp3_2();
        System.out.print("\nEnter a number :");
        int n=sc.nextInt();
        int factorial=ob.factorial(n);
        int digsum=ob.dig_Sum(n);
        if(factorial==-1)
            System.out.println("Factorial is not defined for negative numbers");
        else
            System.out.println(n+"! = "+factorial);
        if(digsum==-1)
            System.out.println("Sum of digits of negative numbers is not defined");
        else
            System.out.println(n+"\'s sum = "+digsum);
        sc.close();
    }
    
}