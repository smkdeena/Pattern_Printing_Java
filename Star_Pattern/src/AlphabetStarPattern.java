
public class AlphabetStarPattern {

	public static void main(String[] args) {
		
		int row, n= 8;
		
		for(row=0;row<=n;row++) {
			for(int col=0;col<=n/2;col++) {
				if(col==0 || col==n/2 && row!=0 || row==0 && col!=n/2 || row==n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}
