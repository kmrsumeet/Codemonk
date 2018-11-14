import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		Scanner sc = new Scanner(System.in);
		t= sc.nextInt();
		
		while(t-- > 0){
			String str;
			str = sc.next().toLowerCase();
			char s1[] = str.toCharArray();
			int h = str.length() - 1;
			int l = 0;
			
			while(h > l){
				if(s1[l++]!=s1[h--]){
					System.out.println("NO");
					return;
				}
			}
			System.out.println("YES");
			

	}

}
	
}