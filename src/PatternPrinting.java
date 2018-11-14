
public class PatternPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfRows = 5; 
		int row,col,noOfColToPrint = noOfRows;
		for(row=1;row<=noOfRows;row++){
			for(int col1 = 1;col1<=row;col1++){
				if(col1 == 1){
					System.out.print(" ");
				}
				else
					System.out.print(" ");
			}
			for(int col2 = 1;col2<=noOfColToPrint;col2++){
				System.out.print("*");
			}
			System.out.println();
			noOfColToPrint--;
		}

	}

}
