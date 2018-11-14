import java.util.Scanner;

public class printHackerEarth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		str = sc.next();
		char s1[] = str.toCharArray();
		
		int count1[] = new int[7];
		for(int i = 0;i<n;i++){
			if(s1[i]=='h')
				count1[0]++;
			if(s1[i]=='a')
				count1[1]++;
			if(s1[i]=='c')
				count1[2]++;
			if(s1[i]=='k')
				count1[3]++;
			if(s1[i]=='e')
				count1[4]++;
			if(s1[i]=='r')
				count1[5]++;
			if(s1[i]=='t')
				count1[6]++;
		}
		count1[0]/=2;
		count1[1]/=2;
		count1[4]/=2;
		count1[5]/=2;
		int min1=count1[0];
		for(int i=0;i<7;i++){
			min1 = Math.min(min1, count1[i]);
		}
		System.out.println(min1);
		
	}

}
