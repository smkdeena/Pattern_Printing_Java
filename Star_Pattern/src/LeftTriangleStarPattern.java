
public class LeftTriangleStarPattern {

	public static void main(String[] args) {
		
		int n=3;
		
		for(int row=1;row<=n;row++) {
			for(int space=row;space<n;space++) {
				System.out.print(" ");
			}
			for(int star=1;star<=row;star++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
