import java.util.Scanner;
public class Q17 {
	static void per(String s, String ans) {
		if(s.length() == 0) {
			System.out.println(ans);
			return;
		}
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			String r;
			r = s.substring(0, i)+ s.substring(i+1);
			per(r, ans+ch);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.next();
		String ans = "";
		per(s, "");
		
	}
}
