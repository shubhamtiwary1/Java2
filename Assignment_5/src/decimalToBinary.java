import java.util.Scanner;
public class decimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any decimal number: ");
		int a = sc.nextInt();
		String res = "";
		int bit = 0;
		while(a>0 && bit<8) {
			int r = a%2;
			res += r;
			a= a/2;
			bit++;
		}
		
		System.out.println(res);
		String rev = "";
		for(int i=res.length()-1; i>=0; i--) {
			rev += res.charAt(i);
		}
		while(bit != 8) {
			rev = '0'+rev;
			bit++;
		}
		System.out.println(rev);
	}

}
