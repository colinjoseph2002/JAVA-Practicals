import java.util.*;
public class Exp3_3 
{
    int frequency(String s,char x)
    {
        s=s.toLowerCase();
        int frequency = 0,flag=0;

        for(int i = 0; i < s.length(); i++) 
        {
            if(x == s.charAt(i)) 
            {
                ++frequency;
                flag=1;
            }
        }
        if(flag!=1)
            return -1;
        else
            return frequency;
    }
    String reverse(String str)
    {
        String rev="";
        int i=0,j=str.length()-1;
        for(i=j;i>=0;i--)
            rev=rev+str.charAt(i);
        return rev;
    }
    public static void main(String[] args) 
    {
        Exp3_3 ob=new Exp3_3();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine(),rev="";
        System.out.print("\nEnter a character whose frequency is to be found");
        char ch = sc.next().charAt(0);
        int frequency=ob.frequency(str, ch);
        if(frequency==-1)
            System.out.println("Charactcer not present in the string");
        else
            System.out.println("Frequency of " + ch + " = " + frequency);
        sc.close();
        System.out.println("Original String :"+str);
        rev=ob.reverse(str);
        System.out.println("Reversed String :"+rev);
    }  
}