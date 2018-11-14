import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		Scanner sc = new Scanner(System.in);
		t= sc.nextInt();
		
		while(t-- > 0){
			String str, str1;
			str = sc.next();
			str1 = sc.next();
			char s1[] = str.toCharArray();
			char s2[] = str1.toCharArray();
			int count1[] = new int[26];
			for(int i =0;i<str.length();i++){
				count1[s1[i]-97]++;
			}
			for(int i =0;i<str1.length();i++){
				count1[s2[i]-97]--;
			}
			int c =0;
			for(int i = 0;i<26;i++){
				if(count1[i] > 0 || count1[i] <0){
					c = c + Math.abs(count1[i]);
				}
		}
			System.out.println(c);
			
			
			
		}
		

	}

}
