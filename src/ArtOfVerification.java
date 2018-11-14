import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArtOfVerification {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stu
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));			 
		String s=br.readLine().trim();
		int index=s.indexOf('?');
		s=s.substring(index+1);
		//String arr[]=s.split("&{1}[a-z]+={1}");
		String arr[]=s.split("&[a-z]+=");
		arr[0]=arr[0].replace("=",": ");
		System.out.println(arr[0]);
		System.out.println("pwd: "+arr[1]);
		System.out.println("profile: "+arr[2]);
		System.out.println("role: "+arr[3]);
		System.out.println("key: "+arr[4]);

	}

}
