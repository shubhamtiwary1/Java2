import java.util.Scanner;
public class matrix_spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub n
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column.");
		int r = sc.nextInt();
		int c = sc.nextInt();
		System.out.print("Enter r * c matrix.");
		int a[][] = new int[r][c];                                                                                    
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		int w = 0;
	    int x = a.length-1;
	    int y = 0;
	    int z = a[0].length-1;
	    while(w <= x && y <= z){
	       for (int i = w; i <= z; i++) {
	          System.out.print(a[w][i] + " ");
	       }
	       for (int i = w+1; i <= x; i++) {
	          System.out.print(a[i][z] + " ");
	       }
	       if(w+1 <= x){
	          for (int i = z-1; i >= y; i--) {
	             System.out.print(a[x][i] + " ");
	          }
	       }
	       if(y+1 <= z){
	          for (int i = x-1; i > w; i--) {
	             System.out.print(a[i][y] + " ");
	          }
	       }
	       w++;
	       x--;
	       y++;
	       z--;
	    }
	}
}