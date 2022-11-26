import java.util.Scanner;
public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char[] s = a.toCharArray();
		for(int i=0; i<s.length; i++) {
			if (a.lastIndexOf(s[i]) == a.indexOf(s[i])){
		        System.out.println("First non-repeating character is "+ s[i]);
		        break;
		    }
		}
	}
}
