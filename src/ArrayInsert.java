import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,q;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		q = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		while(q-- > 0){
			int query,x,y,sum =0;
			query = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			
			if(query == 1){
				arr[x] = y;
			}
			else if(query == 2){
				for(int i =x;i<=y;i++){
					sum = sum + arr[i];
				}
				System.out.println(sum);
			}
			
			
		}
		

	}

}
