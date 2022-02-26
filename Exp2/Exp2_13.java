import java.util.*;
public class Exp2_13
{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr a String:");
        String str = sc.nextLine();
        str=str.toLowerCase();
        System.out.println("Enter a character whose frequency is to be found");
        char ch = sc.next().charAt(0);
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);
        sc.close();
    }
}