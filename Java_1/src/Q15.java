import java.util.Scanner;
public class Q15 {
	public static int simplify(int b, int p) {
		if(p==0) {
			return 1;
		}
		return b*simplify(b, p-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int b = sc.nextInt();
		System.out.print("Enter b: ");
		int p1 = sc.nextInt();
		System.out.print("Enter c: ");
		int p2 = sc.nextInt();
		int p = p1*p2;
		int res = Q15.simplify(b, p);
		System.out.println(res);
	}
}
