import java.io.*;
import java.util.*;
class Exp5_3
{
 public static void main(String args[]) throws Exception
 { 
  try
  {
   Scanner sc=new Scanner(System.in);
   Scanner sc1=new Scanner(System.in);
   FileWriter fw=new FileWriter("file_3.txt");
   System.out.println("\nName : ");
   String name=sc.nextLine();
   System.out.println("\nAddress : ");
   String address=sc1.nextLine();
   sc.close();sc1.close();
   fw.write(name+"\n");
   fw.write(address);
   fw.close();
   FileReader fr=new FileReader("file_3.txt");
   int ch=0;
   while((ch=fr.read())!=-1)
    System.out.println((char)ch);
   System.out.println("\n");
   fr.close();
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
}