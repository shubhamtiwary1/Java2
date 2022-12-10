
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "I am Shubham";
		String b = "";
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i) != ' '){
				b = b+a.charAt(i);
			}
		}
		System.out.println(b);
	}

}
