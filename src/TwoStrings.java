import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	       int t = sc.nextInt();
	       while(t-- > 0){
	           String str1,str2;
	           str1 = sc.next();
	           str2 = sc.next();
	           int count1[] = new int[26];
	           char s1[] = str1.toCharArray();
	           char s2[] = str2.toCharArray();
	           
	           for(int i = 0; i< str1.length();i++)
	           {
	               count1[s1[i]-97]++;
	           }
	           for(int i =0;i< str2.length();i++)
	           {
	               count1[s2[i]-97]--;
	           }
	           int flag = 0;
	           for(int i = 0 ;i<26;i++){
	        	   if(count1[i] > 0){
	        		   flag = 1;
	        	   }
	        	   
	           }
	           if(flag == 1)
	           System.out.println("NO");
	           else
	           System.out.println("YES");
	           
	       }
	}

}
