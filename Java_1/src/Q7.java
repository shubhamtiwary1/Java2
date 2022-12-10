import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st number: ");
		String s1 = sc.next();
		System.out.print("Enter the 2nd number: ");
		String s2 = sc.next();
		if(s1.length()>s2.length()) {
			String t = s1;
			s1 = s2;
			s2 = t;
		}
		int l1 = s1.length();
		int l2 = s2.length();
		int c = 0;
		String res = "";
		System.out.println(l1);
		for(int i=l1-1; i>=0; i--) {
			int sum = s1.charAt(l1)-'0'+s2.charAt(l2)-'0'+c;	
			res = (sum%10)+res;
			c = sum/10;
		}
		for(int i=s2.length()-s1.length(); i>0; i--) {
			System.out.println(s2.charAt(i));
			int sum = s2.charAt(i)-'0'+c;
			res = sum%10+res;
			c = sum/10;
			System.out.println(res);   
		}
		if(c!=0) {
			res = c+res;
		}
		System.out.println(res);
	}

}
