import java.util.Scanner;

public class MagicalWord {
	
	
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
		Scanner sc = new Scanner(System.in);	
		int t = sc.nextInt();
		
		while(t-- >0){
			int n;
			n = sc.nextInt();
			String str;
			str = sc.next();
			char s1[] = str.toCharArray();
			for(int i = 0;i<n;i++){
				int p1=0,p2=0;
				int x = (int)s1[i];
				int a = x;
				int b = x;
				boolean y;
				y = isPrime(x);
				if(y == true){
					s1[i] = s1[i];
				}
				else
				{
					//int p1,p2;
					//a++;
					//b--;
					boolean b1,b2;
					
					while(isPrime(a) != true){
						a++;
					}
					
					p1 = a;
	
					
					while(isPrime(b)!= true){
						b--;
					}
					
						p2 = b;

					int primeChar;
					if((p1-x) == (x-p2)){
						primeChar = (char)p2;
					}
					else {
						if(((p1-x) < (x-p2)) && p1!=127){
							primeChar = p1;
						}
						else
						{
							primeChar = p2;
						}
					}
					s1[i] = (char)primeChar;
					
				}
				
			}
			for(int i =0;i<n;i++){
				System.out.print(s1[i]);
			}
			System.out.println();
			
		}
		

	}

}
