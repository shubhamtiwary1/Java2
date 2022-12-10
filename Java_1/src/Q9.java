import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		if(a<=1) {
			System.out.println("Not a Prime.");
			return;
		}
		for(int i = 2; i<a; i++) {
			if(a%i == 0) {
				System.out.println("Not a Prime");
				return;
			}
		}
		System.out.println(a + " is a Prime.");
	}
}
