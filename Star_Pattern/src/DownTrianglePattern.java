
public class DownTrianglePattern {

	public static void main(String[] args) {
		
		int n=8;
		
		for(int row=n;row>=1;row--) {
			for(int col=n;col>row;col--) {
				System.out.print(" ");
			}
			for(int col=1;col<=(2*row-1);col++) {
				if(col==1||row==n||col==2*row-1)
				{
				System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}
