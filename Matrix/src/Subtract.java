import java.util.Scanner;

public class Subtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][n];	
		int b[][] = new int[n][n];
		
		int c[][] = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				c[i][j] = a[i][j] - b[i][j];
				System.out.print(c[i][j] + " ");
			}
		}
		
	}

}
