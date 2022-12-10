import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = sc.nextInt();
		if(x%2 == 1) {
			System.out.println(x + " is Odd.");
		}
		else {
			System.out.println(x + " is not Odd.");
		}
	}

}
