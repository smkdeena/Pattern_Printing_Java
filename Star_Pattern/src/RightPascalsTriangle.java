
public class RightPascalsTriangle {

	public static void main(String[] args) {
		
		int n=8;
		
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		for(int row=1;row<n;row++) {
			for(int col=n;col>row;col--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
