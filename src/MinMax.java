import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int min1 = arr[0];
		int max1 = arr[0];
		long originalSum = 0;
		int count1[] = new int[1001];
		for(int i = 0;i<n;i++){
			min1 = Math.min(min1, arr[i]);
			max1 = Math.max(max1, arr[i]);
			//originalSum = originalSum + arr[i];
			count1[arr[i]] = 1;
		}
		int flag = 0;
		for(int i = min1;i<=max1;i++){
			if(count1[i]!=1){
				flag = 1;
			}
		}
		
		if(flag == 1){
			System.out.println("NO");
		}
		else
			System.out.println("YES");

	}

}
