import java.util.*;
class Exp1_3
{
    public static void main(String args[])
    {
     int a;
     System.out.println("Enter the number");
     Scanner c=new Scanner(System.in);
     a=c.nextInt();
     if(a%2==0)
     System.out.println(a+" is even");
     else
     System.out.println(a+" is odd");
    }
}