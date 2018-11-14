import java.util.Scanner;

public class PrimeCheck {
	
	public static boolean isPrime(int p){
		if(p==0 || p ==1){
			return false;
		}
		if(p==2 || p== 3)
		{
			return true;
		}
		for(int i = 2;i<=Math.sqrt(p);i++){
			if(p%i==0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		boolean x = isPrime(n);
		if(x == true)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}

}
