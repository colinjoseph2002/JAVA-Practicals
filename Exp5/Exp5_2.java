import java.io.*;
class Exp5_2 {
    public static void main(String[] args) throws Exception {

    FileInputStream fin = new FileInputStream("javatext.txt");

    int c=-1, l=0, w=0;
    int ch;

    while((ch = fin.read())!=-1) {

        ++c;
        if(ch=='\n')
            l++;
        if(ch == ' ' || ch=='\n')
            w++;
    }

    System.out.println("Number of Characters = "+ c);
    System.out.println("Number of Words = "+(w+1));
    System.out.println("Number of Lines = "+(l+1));

    fin.close();
    }
}