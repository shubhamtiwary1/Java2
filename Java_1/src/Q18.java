import java.util.Scanner;
public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s = sc.nextLine();
		
		
		for(int i=0; i<s.length(); i++) {
			int k = i;
			String ans = "";
			while(s.charAt(k)!=' ') {
				ans = ans+s.charAt(k);
				k++;
			}
			i = k;
			System.out.print(ans + " ");
				
		}
	}
}
