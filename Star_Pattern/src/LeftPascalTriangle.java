
public class LeftPascalTriangle {

	public static void main(String[] args) {
		
		int n=8;
		
		for(int row=1;row<=n;row++) {
			for(int space=n;space>row;space--) {
				System.out.print(" ");
			}
			for(int star=1;star<=row;star++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int row=1;row<n;row++) {

			for(int space=1;space<=row;space++) {
				System.out.print(" ");
			}
			for(int star=n;star>row;star--) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		
	}
}