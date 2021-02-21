
public class DiamondShapePattern {
	
public static void main(String[] args) {
		
		int row, col;
		int n=8;
		int space=n-1;
		
		for(row=1;row<=n;row++) {
			for(col=n;col>row;col--) {
				System.out.print(" ");
			}
			for(col=1;col<=2*row-1;col++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		for(row=1;row<n;row++) {
			for(col=1;col<=row;col++) {
				System.out.print(" ");
			}
			for(col=1;col<=2*(n-row)-1;col++) {
				System.out.print("*");
			}
			System.out.println("");
						
		}
		
		}

	}
