import java.io.*;
import java.util.*;
class Exp3_6
{
    void concatenate(int x,int y)
	{
        System.out.println("Integer : "+x+y);
	}
	void concatenate(String a, String b)
	{
        System.out.println("String : "+ a+b);
	}
    public static void main(String args[])throws IOException
    {
        InputStreamReader ir= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        String str[]=new String[2];
	    Scanner o=new Scanner(System.in);
	    Exp3_6 obj=new Exp3_6();
	    System.out.println("Choose the type of data : \n1 : Number\n2 : String");
	    int z=o.nextInt() ;
	    switch(z)
	    {
		case 1:
		System.out.println("Enter the first no : ");
		int x= o.nextInt();
		System.out.println("Enter the second no : ");
		int y=o.nextInt();
		obj.concatenate(x,y);
		break;
		case 2:
		for(int i=0; i<2;i++)
        {
            System.out.println("Enter String "+(i+1)+":");
            str[i]=br.readLine();

        }
		obj.concatenate(str[0],str[1]);
		break;
		default:
		System.out.println("Error");
		break;
	    }
        o.close();
	}
}
