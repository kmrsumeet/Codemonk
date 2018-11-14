

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

*/
/*
Author solution
class example_2
{
    static Scanner sc;
    static PrintWriter out;

    static void init() throws Exception
    {
        sc=new Scanner(new File("si.txt"));
        out=new PrintWriter(new File("so.txt"));
    }

    public static void main(String args[]) throws Exception
    {
        init();
        char[] a=sc.next().toCharArray();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>=97 && a[i]<=122)
            {
                a[i]-=32;
            }
            else
            {
                a[i]+=32;
            }
        }
        for(char ch:a)
        {
            out.print(ch);
        }
        out.close();
    }
}


*/
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.Scanner;
class ToggleString {
    public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner(System.in);
       String str;
       str = sc.next();
       char s1[] = str.toCharArray();
       for(int i=0;i<str.length();i++)
       {
           if(Character.isLowerCase(s1[i]) == true){
               s1[i] = Character.toUpperCase(s1[i]);
           }
           else
           {
        	   s1[i] = Character.toLowerCase(s1[i]);
           }
       }
       for(int i = 0;i<str.length();i++){
           System.out.print(s1[i]);
       }
    }
}

