import java.util.Scanner;
public class rotateMatrixBY90deg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column of 1st matrix.");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();	
		int a[][] = new int[r1][c1];
		
		System.out.println("Enter 1st matrix.");
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		int b[][] = new int[r1][c1];
		
		for(int i=0; i<r1; i++) {
			int k=r1-1;
			for(int j=0; j<c1; j++) {
				if(k>=0) {
					b[i][j] = a[k--][i];
				}
			} 
		}
		System.out.println("Rotated matrix is:");
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}
}
