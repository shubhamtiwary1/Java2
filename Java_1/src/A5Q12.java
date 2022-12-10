
public class A5Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5555444;
		int n = 6;
		while(a>0) {
			int count = 0;
			int rem = a%10;
			int aa = 5555444;
			while(aa>0) {
				int rem1 = aa%10;
				if(rem == rem1) {
					count++;
				}
				aa = aa/10;
			}
			a = a/10;
			System.out.println(rem + " occurs " + count + "  times.");
		}
		
	}

}
