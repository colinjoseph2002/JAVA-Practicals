import java.io.*;
import java.util.*;
class Employee
{
        String name="";
        int empno=0;
        long phno=0;
}
public class Exp3_7
{

    public static void main(String args[]) throws IOException,Exception
    {    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of employees");
        int n=sc.nextInt();
        Employee e[]=new Employee[n];
        for(int i=0;i<n;i++)
        {
            e[i]=new Employee();
            System.out.println("Enter details of Employee "+(i+1)+":");
            System.out.println("Enter Employee no: ");
            e[i].empno=sc.nextInt();
            System.out.println("Enter Name: ");
            e[i].name=sc.next();
            System.out.println("Enter Phone no: ");
            e[i].phno=sc.nextLong();
        }
        System.out.println("\n\n********* All Employee Details are :*********\n");
        for (int i=0;i<n;i++)
        {
            System.out.println("Employee no,Name and Phone no :" + e[i].empno + " " + e[i].name + " " + e[i].phno);
        }
        sc.close();
    }
}