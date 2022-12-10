import java.util.Scanner;
public class Sudoku {
	static boolean check(int a[][]) {
		for(int i=0; i<9; i++) {
			for(int j=0; j<8; j++) {
				int k=j;
				if(a[i][k] == a[i][j+1]) {
					return false;
				}
			}
		}
		for(int i=0; i<9; i++) {
			for(int j=0; j<8; j++) {
				int k=j;
				if(a[i][j] == a[j+1][i]) {
					System.out.println(a[j+1][i]);
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 9;
		int a[][] = {{5, 3, 4, 6, 7, 8, 9, 1, 2},{6, 7, 2, 1, 9, 5, 3, 4, 8},{1, 9, 8, 3, 4, 2, 5, 6, 7},{8, 5, 9, 7, 6, 1, 4, 2, 3},{4, 2, 6, 8, 5, 3, 7, 9, 1},{7, 1, 3, 9, 2, 4, 8, 5, 6},
		          {9, 6, 1, 5, 3, 7, 2, 8, 4},{2, 8, 7, 4, 1, 9, 6, 3, 5},{3, 4, 5, 2, 8, 6, 1, 7, 9}};	
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sub Matrix 1");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sub Matrix 2");
		for(int i=0; i<3; i++) {
			for(int j=3; j<6; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sub Matrix 3");
		for(int i=0; i<3; i++) {
			for(int j=6; j<9; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sub Matrix 4");
		for(int i=3; i<6; i++) {
			for(int j=0; j<3; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sub Matrix 5");
		for(int i=3; i<6; i++) {
			for(int j=3; j<6; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sub Matrix 6");
		for(int i=3; i<6; i++) {
			for(int j=6; j<9; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sub Matrix 7");
		for(int i=6; i<9; i++) {
			for(int j=0; j<3; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sub Matrix 8");
		for(int i=6; i<9; i++) {
			for(int j=3; j<6; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sub Matrix 9");
		for(int i=6; i<9; i++) {
			for(int j=6; j<9; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		boolean val = Sudoku.check(a);
		if(val) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Not valid.");
		}
	}
}
