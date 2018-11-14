import java.math.BigInteger;
import java.util.Scanner;

public class IsItPossible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		 * 
		 * 
		 * while(t--)
    {
        string s;
        cin>>s;
        if(s[s.length()-1]%2==0)
        cout<<"YES"<<endl;
        else
        cout<<"NO"<<endl;
    }
		 */
		int t = sc.nextInt();
		while(t-- > 0){
			String str;
			str = sc.next();
			BigInteger b1 = new BigInteger(str);
			BigInteger b2 = new BigInteger("2");
			BigInteger b3 = b1.mod(b2);
			int x =b3.intValue();
			if(x == 0){
				System.out.println("YES");
			}
			else
				System.out.println("NO");
		
		}
	}

}
