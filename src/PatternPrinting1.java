import java.util.Scanner;

public class PatternPrinting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		int noOfRows = sc.nextInt();
		//int noOfColToPrint = noOfRows - 1;
		for(int row = 1;row<= noOfRows; row++){
			for(int colSapce = noOfRows-row;colSapce>=1;colSapce--){
				System.out.print(" ");	
			}
			for(int colStar = 1;colStar<=(row*2)-1;colStar++){
				System.out.print("*");
			}
			System.out.println();
		}
		}

	}

}
