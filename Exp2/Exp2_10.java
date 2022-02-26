import java.util.*;
class Exp2_10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a \"word\" to be checked: ");
        String word=sc.nextLine(),str="";
        sc.close();
        int i=0,j=word.length()-1;
        for(i=j;i>=0;i--)
        str=str+word.charAt(i);
        if(word.equalsIgnoreCase(str))
        {
            System.out.println(word+" is a Palindrome");
        }
        else
        System.out.println(word+" is not a Palindrome");
    }
}