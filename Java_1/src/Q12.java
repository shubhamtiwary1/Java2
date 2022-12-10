
public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "qqqqttee";
		String p = "QQQQQQtt";
		s = s.toLowerCase();
		p = p.toLowerCase();
		int n1 = s.length();
		int n2 = p.length();
		int x = 0;
		for(int i=0; i<n1; i++) {
			for(int j=0; j<n2; j++) {
				if(s.charAt(i)==p.charAt(j)) {
					x++;
					break;
				}
			}
		}
		if(x == n1 && x == n2) {
			System.out.println("Both are anagram.");
		}
		else {
			System.out.println("Not a anagram.");
		}
	}

}
