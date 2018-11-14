import java.util.Scanner;

public class HawkeyeAndFloodfill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		int x,y,p;
		x = sc.nextInt();
		y = sc.nextInt();
		p = sc.nextInt();
		int a,b,dis;
		for(int i =0;i<n;i++){
			for(int j =0;j<n;j++){
				a = Math.abs(x-i);
				b = Math.abs(y-j);
				dis = Math.max(a, b);
				if(dis<p)
					System.out.print((p-dis) + " ");
				else
					System.out.print("0" + " ");
			}
				System.out.println();
			
		}
		
		

	}

}
