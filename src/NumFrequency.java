import java.util.Scanner;

public class NumFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		char str[] = s.toCharArray();
		int count1[] = new int[10];
		
		for(int i = 0;i<s.length();i++){
			count1[str[i]-48]++;
		}
		for(int i = 0;i<9;i++){
			System.out.println(i + " " + count1[i]);
		}
		

	}

}
