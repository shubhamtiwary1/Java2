import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		s = s.toLowerCase();
		System.out.println(s);
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == ' ') {
				continue;
			}
			else if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				System.out.println(s + " has vowels in it.");
				return;
			}
		}
		System.out.println("No vowels in the String.");
	}
}
