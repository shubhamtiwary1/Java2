import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st number: ");
		String s1 = sc.next();
		System.out.print("Enter the 2nd number: ");
		String s2 = sc.next();
		int l1 = s1.length()-1;
		int l2 = s2.length()-1;
		int i = 0;
		int j = 0;
		int res = 0;
		while(i>=0 || j>=0) {
			res = s1.charAt(l1)+s1.charAt(l2)+(s1.charAt(l1--)+s1.charAt(l2--))/10;
		}
	}

}
