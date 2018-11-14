import java.util.ArrayList;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	
	while(t-- > 0){
		int n;
		n = sc.nextInt();
		int primes[] = new int[n+1];
		
		for(int i=0;i<=n;i++){
			primes[i] = 1;
		}
		
		primes[0] = 0;
		primes[1] = 0;
		
		for(int i = 2;i<=Math.sqrt(n);i++){
			if(primes[i] == 1){
			for(int j = 2 ;i*j<=n;j++){
				primes[i*j] = 0;
			}
		}
			
		}
		//ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 2;i<=n;i++){
			if(primes[i] == 1){
				System.out.print(i + " ");
			}
		}
		System.out.println();
	//	System.out.println(list);
		
	}

	}

}
