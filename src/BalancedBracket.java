import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	        String line = sc.next();
	      int N = sc.nextInt();
	        char str[] = line.toCharArray();
	        int l = line.length();
	        Stack st = new Stack();
	        int c =0,ans =0;
	          if((str[0]==')') || (str[l-1] == '(')){
	            ans = 1;
	        }
	        else {
	        
	        if(N==1){
	            for(int i=0;i<line.length();i++){
	                if(str[i]=='('){
	                    st.push(str[i]);
	                    /*c++;*/
	                }
	                else{
	                    c++;
	                    if(st.empty()){
	                        ans = c;
	                        break;
	                    }
	                    else{
	                        st.pop();
	                    }
	                }
	            }
	        } else{
	            for(int i=line.length()-1;i>=0;i--){
	                if(str[i]==')'){
	                    st.push(str[i]);
	                    /*c++;*/
	                }
	                else{
	                    c++;
	                    if(st.empty()){
	                        ans = c;
	                        break;
	                    }
	                    else{
	                        st.pop();
	                    }
	                }
	            }
	        }
	        }
	        
	       
	    
	        System.out.println(ans);
	        
	}

}
