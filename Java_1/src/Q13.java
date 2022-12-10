import java.util.Scanner;
public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = sc.nextLine();
		s = s.toLowerCase();
		String n = "";
		System.out.print("Enter the character to remove: ");
		char c = sc.next().charAt(0);
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==c) {
				continue;
			}
			else {
				n = n + s.charAt(i);
			}
		}
		System.out.println(n);
	}

}
