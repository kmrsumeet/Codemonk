import java.util.Scanner;

public class FindProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		long prod = 1;
		for(int i = 0;i<n;i++){
			prod = (prod * arr[i])%(1000000007);
		}
		System.out.println(prod);

	}

}
