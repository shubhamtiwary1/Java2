
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abacaba";
		String b = "";
		for(int i = a.length()-1; i>=0; i--){
			b = b+a.charAt(i);
		}
		if(a.equals(b)) {
			System.out.println("Given string is Palindrom");
		}
		else {
			System.out.println("Given string is not Palindrom");
		}

	}

}
