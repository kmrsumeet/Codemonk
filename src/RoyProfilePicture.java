import java.util.Scanner;

public class RoyProfilePicture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int L,N,W,H;
		L = sc.nextInt();
		N = sc.nextInt();
		for(int i =0;i<N;i++)
		{
			W = sc.nextInt();
			H = sc.nextInt();
			
			if(W< L || H < L){
				System.out.println("UPLOAD ANOTHER");
			}
			else if(((W == L) && (H == L)) || ((W > L) && (H > L) && (W==H)) )
			{
				System.out.println("ACCEPTED");
				
			}
			else
			{
				System.out.println("CROP IT");
			}
			
		}
	}

}
