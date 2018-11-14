import java.util.Scanner;

public class MinimizeCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,k;
		n = sc.nextInt();
		k = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		int j = 0;
		
		for(int i =0;i<n;i++){
			
			if(arr[i] < 0)
				continue;
			
			while(i-j > k){
				++j;
			}
			
			while(arr[i]!=0 && (i+k)>= Math.min(n-1,j))
					{
						if(arr[j]>0){
							j++;
							continue;
						}
						int x = Math.min(arr[i], Math.abs(arr[j]));
						arr[i]-=x;
						arr[j]+=x;
						if(arr[j]>=0){
							j++;
						}
					}
		}
						
						long ans = 0;
						for(int i=0;i<n;i++){
							ans+=Math.abs(arr[i]);
						}
						System.out.println(ans);
				
			}
	
			
		}
		

