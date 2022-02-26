import java.util.*;
class employee
{
 String name,phno,address;
 int age;
 int salary;
 void getDetails()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Name : ");
  name=sc.next();
  System.out.println("Enter Age : ");
  age=sc.nextInt();
  System.out.println("Enter Phone No : ");
  phno=sc.next();
  System.out.println("Enter Address : ");
  address=sc.next();
  System.out.println("Enter Salary : ");
  salary=sc.nextInt();
 }
 void printSalary()
 {
  System.out.println("Name : "+name);
  System.out.println("Age : "+age);
  System.out.println("Phone No : "+phno);
  System.out.println("Address : "+address);
  System.out.println("Salary : "+salary);
 }
}
 //Class Officer....
class officer extends employee
{
 String spec;
 void getDetails()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Specialization : ");
  spec=sc.next();
  super.getDetails();
 }
 void printDetails()
 {
  super.printSalary();
  System.out.println("Specialization : "+spec);
 }
}
 //Class Manager....
class manager extends employee
{
 String dep;
 void getDetails()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Department : ");
  dep=sc.next();
  super.getDetails();
 }
 void printDetails()
 {
  super.printSalary();
  System.out.println("Department : "+dep);
 }
}
//Main Class....
public class Exp4_1
{
 public static void main(String args[])
 {
  officer ob=new officer();
  manager ob1=new manager();
  System.out.println("Enter Officer Details : ");
  ob.getDetails();
  System.out.println("Enter Manager Details : ");
  ob1.getDetails();
  System.out.println("***Officer Details***");
  ob.printDetails();
  System.out.println("***Manager Details***");
  ob1.printDetails();
 }
}