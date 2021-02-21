
public class PyramidStarPattern {

	public static void main(String[] args) {
		
		int row, col;
		int n=4;
		int space=n-1;
		
		for(row=1;row<=n;row++) {
			for(col=space;col>=row;col--) {
				System.out.print(" ");
			}
			for(col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
			
		}

	}

