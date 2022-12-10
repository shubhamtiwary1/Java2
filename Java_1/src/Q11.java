import java.util.Arrays;
import java.util.Scanner;
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		boolean r = true;
		for(int i=0; i<s.length(); i++) {
			if(t.indexOf(s.charAt(i)) == -1) {
				r = false;
			}
		}
		for(int i=0; i<t.length(); i++) {
			if(s.indexOf(t.charAt(i)) == -1) {
				r = false;
			}
		}
		System.out.println(r);
	}
}
