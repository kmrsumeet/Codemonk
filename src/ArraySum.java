import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int arr[] = new int[n];
		long sum = 0;
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
			sum = (sum + arr[i]);
		}
		System.out.println(sum);
		
		

	}

}
