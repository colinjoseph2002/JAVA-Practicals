import java.util.*;
public class Exp3_4 {
    void area(float radius)
    {
        double area=3.14159265358979323846264*radius*radius;
        System.out.println("Area of Circle of radius = "+radius+"is : "+area);
    }
    void area(float length, float breadth)
    {
        double area=length*breadth;
        System.out.println("Area of Rectangle of length = "+length+", breadth = "+breadth+"is : "+area);
    }
    void area(double base, double height)
    {
        double area=0.5*base*height;
        System.out.println("Area of Triangle of base = "+base+", height = "+height+"is : "+area);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("1.Area of Circle\n2.Area of Rectangle\n3.Area of Right Angled Triangle\n");
        int c=sc.nextInt();
        Exp3_4 ob=new Exp3_4();
        switch(c)
        {
            case 1:
            System.out.println("Enter radius");
            float r=sc.nextFloat();
            ob.area(r);
            break;
            case 2:
            System.out.println("Enter length");
            float l=sc.nextFloat();
            System.out.println("Enter breadth");
            float b=sc.nextFloat();
            ob.area(l,b);
            break;
            case 3:
            System.out.println("Enter base");
            double base=sc.nextDouble();
            System.out.println("Enter height");
            double h=sc.nextDouble();
            ob.area(base,h);
            break;
            default:
            System.out.println("Invalid choice");
         }
        sc.close();
    }
    
}
