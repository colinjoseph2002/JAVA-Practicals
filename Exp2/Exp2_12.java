import java.util.*;
public class ReplaceString {

	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();
		System.out.println("Enter index:");
		int index = sc.nextInt();
		System.out.println("Enter character to replace with:");
		char ch = sc.next().charAt(0);
		System.out.println("Original String = " + str);
		str = str.substring(0, index) + ch
			+ str.substring(index + 1);
		System.out.println("Modified String = " + str);
        sc.close();
	}
}
