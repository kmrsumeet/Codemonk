import java.util.Scanner;

public class Cipher {
	
	/*
	 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] arr = str.toCharArray();
        int n = Integer.parseInt(br.readLine());
        int rotateAlpha = n % 26;
        int rotateNum = n % 10;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] >= 65 && arr[i] <= 90)
            {
 
                arr[i] = (char)(((arr[i] - 65 + rotateAlpha) % 26) + 65);
            }
            else if(arr[i] >= 97 && arr[i] <= 122)
            {
                arr[i] = (char)(((arr[i] - 97 + rotateAlpha) % 26) + 97);
            }
            else if(arr[i] >= 48 && arr[i] <= 57)
            {
                arr[i] = (char)(((arr[i] - 48 + rotateNum) % 10) + 48);
            }
        }
        System.out.println(new String(arr));
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char s1[] = str.toCharArray();
		int n;
		n = sc.nextInt();
		//n = n%256;
		int x = n;
		
		
		for(int i=0;i<str.length();i++){
			x = n;
			if((s1[i]>=48 && s1[i]<=57)){
				int ascii = (int) s1[i];
				x = x%10;
				x = (x + ascii)%57;
				if(x == 0)
					x = 57;
				if(x>=48 && x<=57){
					s1[i] = (char)x;
				}
			
				else
				{
					x = x + 47;
					s1[i] = (char)x;
				}
				
				
			}
			else if(s1[i]>=65 && s1[i]<=90)
			{
				int ascii = (int) s1[i];
				x = x%26;
				x = (x + ascii)%90;
				if(x == 0)
					x = 90;
				if(x>=65 && x<=90){
					s1[i] = (char)x;
				}
	
				else
				{
					x = x + 64;
					s1[i] = (char)x;
				}
				
			}
			else if(s1[i]>=97 && s1[i]<=122)
			{
				int ascii = (int) s1[i];
				x=x%26;
				x = (x + ascii)%122;
				if(x == 0)
					x = 122;
				if(x>=97 && x<=122){
					s1[i] = (char)x;
				}
				else
				{
					x = x + 96;
					s1[i] = (char)x;
				}
			}
		}
		for(int i =0;i<str.length();i++){
			System.out.print(s1[i]);
		}

	}

}
//Epp-gsrzsCw-3-fi:Epivx5.