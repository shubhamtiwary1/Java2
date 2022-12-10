
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "I am   Shubham";
		String b = "";
		int c = 0;
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i) != ' ') {
				c++;
				while(i<a.length() && a.charAt(i) != ' '){
					i++;
				}
			}	
		}
		System.out.println(c);
	}
}
