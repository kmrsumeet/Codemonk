import java.util.Scanner;

public class GreatKian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		long sums[] = new long[3];
		for(int i = 0;i<3;i++)
			sums[i] = 0;
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int k = 0;
		for(int i = 0;i<3;i++){
			for(int j = i;j<n;j=j+3){
				sums[k] = sums[k] + arr[j];
			}
			k++;
			if(k == 3)
				break;
		}
		for(int j = 0;j<3;j++){
			System.out.print(sums[j] + " ");
		}
		
	}

}
