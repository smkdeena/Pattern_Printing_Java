
public class RightDownMirrorStarPattern {

	public static void main(String[] args) {
		int n=5;
		
		for(int row=1;row<=n;row++) {
			for(int space=1;space<row;space++)
			{
				System.out.print(" ");
			}
			for(int star=n;star>=row;star--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
