import java.util.Scanner;

public class BatmanTicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		    int x=5,o=7,flag,i,j;
		    int a[][]=new int[4][4];
	        String arr="";
		int num=scan.nextInt();		
		while(num>0){
		    flag=0;
		    for(i=0;i<4;i++){
		        arr=scan.next();
		        for(j=0;j<4;j++){
		            
		            if(arr.charAt(j)=='x')
		                a[i][j]=5;
		           else if (arr.charAt(j)=='o')
		            a[i][j]=7;
		            else a[i][j]=0;
		        }
		    }    
		    for(i=0;i<4;i++)
		        if((a[i][0]+a[i][1]+a[i][2]==10)||(a[i][1]+a[i][2]+a[i][3]==10))
		            flag=1;
		            
		   for(i=0;i<4;i++)
		        if((a[0][i]+a[1][i]+a[2][i]==10)||(a[1][i]+a[2][i]+a[3][i]==10))
		            flag=1;
		            
		    if((a[0][0]+a[1][1]+a[2][2]==10)||(a[1][1]+a[2][2]+a[3][3]==10))
		            flag=1;
		            
		   if((a[0][3]+a[1][2]+a[2][1]==10)||(a[1][2]+a[2][1]+a[3][0]==10))
		            flag=1;
		   
		   if((a[0][2]+a[1][1]+a[2][0]==10)||(a[1][3]+a[2][2]+a[3][1]==10))
		            flag=1;
		   
		   if((a[1][0]+a[2][1]+a[3][2]==10)||(a[0][1]+a[1][2]+a[2][3]==10))
		            flag=1;
		   
		    if(flag==1)
		        System.out.println("YES");
		       else
		        System.out.println("NO");
		num--;
		
	}
		

	}

}
