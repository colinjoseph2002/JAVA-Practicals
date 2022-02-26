import java.util.*;
public class Exp3_1 {
    String str;
    int rno, marks[]=new int[5];
    void readDat()
    {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter name:");
        str=sc1.nextLine();
        System.out.println("Enter rollno:");
        rno=sc1.nextInt();
        for(int i=0; i<marks.length;i++)
        {
            System.out.println("Enter marks in subject"+(i+1)+" :");
            marks[i]=sc1.nextInt();
        }
        sc1.close();
    }
    void printDat()
    {
        System.out.println("Name: "+str);
        System.out.println("Roll no: "+ rno);
        System.out.println("Marks in each subject:");
        for(int i=0; i<marks.length;i++)
        {
            System.out.println("Subject"+(i+1)+": "+ marks[i]);
        }

    }
   public static void main(String args[])
   {
       Exp3_1 s=new Exp3_1();
       System.out.println("Enter details of Student "+":");
       s.readDat();
       System.out.println("Details are");
       s.printDat();
   }
}
