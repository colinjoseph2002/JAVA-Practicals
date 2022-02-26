import java.io.*;
public class Exp5_1 {
    public static void main(String args[]) throws IOException {
       
   BufferedReader fin = new BufferedReader(new FileReader("file1.txt"));
    int i=1;
    String line;
    try{
    while((line = fin.readLine()) != null)
    { 
       System.out.println(i+" "+line);
       i++;
    }
}catch(IOException e){System.out.print("Error");}
   
   fin.close();
 }
}