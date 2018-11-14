import java.util.Scanner;

public class PsychicPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		char s1[] = str.toCharArray();
		int c = 0, c1 = 0;
		for(int i = 0;i<str.length();i++){
			if(s1[i] == '0'){
				c1 = 0;
					c++;
				if(c>=6){
					flag = 1;
					break;
				}
			}
			else {
				c = 0;
					c1++;
				if(c1>=6){
					flag = 1;
					break;
				}
				
			}
			
		}
		if(flag == 1){
			System.out.println("Sorry, sorry!");
		}
		else
			System.out.println("Good luck!");
			
			
				
				
			}
		}




