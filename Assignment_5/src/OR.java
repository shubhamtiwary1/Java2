import java.util.Scanner;
	
public class OR {
	static String bin(int x) {
		String res = "";
		int bit = 0;
		while(x>0 && bit<8) {
			int r = x%2;
			res += r;
			x= x/2;
			bit++;
		}
		String rev = "";
		for(int i=res.length()-1; i>=0; i--) {
			rev += res.charAt(i);
		}
		while(bit != 8 && x!=0) {
			rev = '0'+rev;
			bit++;
		}
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int or = a|b;
		int and = a&b;
		int xor = a^b;
		int comp = ~a;
		String oR = OR.bin(or);
		String anD = OR.bin(and);
		String xoR = OR.bin(xor);
		String comP = OR.bin(comp);
		int rlS = OR.shift(a);
		System.out.println(oR);
		System.out.println(anD);
		System.out.println(xoR);
		System.out.println(comP);
		System.out.println(rlS);
	}

}
