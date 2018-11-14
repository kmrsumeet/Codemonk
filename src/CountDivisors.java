import java.util.Scanner;

public class CountDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Best solution O(1)
		 * {
        int l=sc.nextInt(),r=sc.nextInt(),k=sc.nextInt();
        System.out.println((r/k)-((l-1)/k));
    }
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int l,r,k;
		l = sc.nextInt();
		r = sc.nextInt();
		k = sc.nextInt();
		int c = 0;
		for(int i = l;i<=r;i++){
			if(i%k==0){
				c++;
			}
		}
		System.out.println(c);
		

	}

}
