
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 7;
		int numBits = 0;
		while(x != 0) {
			numBits = numBits^(x&1);
			x = x>>>1;
		}
		System.out.println(numBits);
	}

}
