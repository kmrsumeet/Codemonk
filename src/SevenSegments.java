import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SevenSegments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-- >0){
			int n;
			n = sc.nextInt();
			int arr[] = new int[n];
		//	char s1[] = new char[n];
			for(int i = 0;i<n;i++){
				arr[i] = sc.nextInt();
				
			}
			//int count1[] = {7,2,5,5,4,5,6,3,7,6};
			Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			map.put(0,7);
			map.put(1,2);
			map.put(2,5);
			map.put(3,5);
			map.put(4,4);
			map.put(5,5);
			map.put(6,6);
			map.put(7,3);
			map.put(8,7);
			map.put(9,6);
			
			for(int i=0;i<n;i++){
				//int j = 0;
				String str = Integer.toString(arr[i]);
				char s1[] = str.toCharArray();
				Map<Integer,Integer> map1 = new HashMap<Integer,Integer>();
				
				int sum = 0;
				for(int j = 0;j<s1.length;j++){
						sum = sum + map.get(j);
						
					}
				map1.put(arr[i], sum);
				}
			
			}
		}

	}


