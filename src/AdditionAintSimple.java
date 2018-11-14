import java.util.Scanner;

public class AdditionAintSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		while(t-- > 0){
			String str;
			str = sc.next();
			char s1[] = str.toCharArray();
			int j = str.length() - 1;
			char s2[] = new char[str.length()];
			int sum=0,k=0;
			for(int i = 0;i<str.length();i++){
				sum = 0;
				sum = (sum + (s1[i]-'a') + (s1[j]-'a'))%26;

				char x = (char)((sum+1) + 'a');
				if(x=='{')
					x = 'a';
				s2[k] = x;
				k++;
				j--;
			}
			for(int i = 0;i<str.length();i++){
				System.out.print(s2[i]);
			}
			System.out.println();
			
		}

	}

}

/*
 * wqxqw
hhtdmqrrqmdthh
wfxtebetxfw
aajaa
 */
 
