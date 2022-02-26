import java.util.*;
public class Exp3_5 {
    double perimeter;
    Exp3_5(double radius)
    {
        perimeter=2*3.14159265358979323846264*radius;
    }
    Exp3_5(double length, double breadth)
    {
        perimeter=2*(length+breadth);
    }
    void print()
    {
        System.out.println("Perimeter = "+ perimeter);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose the shape whose perimeter is to be calculated\n1: Circle\n2: Rectangle");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
            System.out.println("Enter radius: ");
            double r=sc.nextDouble();
            Exp3_5 ob=new Exp3_5(r);
            ob.print();
            break;
            case 2:
            System.out.println("Enter length: ");
            double l=sc.nextDouble();
            System.out.println("Enter breadth: ");
            double b=sc.nextDouble();
            Exp3_5 ob1=new Exp3_5(l,b);
            ob1.print();
            break;
            default:
            System.out.println("Invalid choice");
        }
        sc.close();
    }
    
}
