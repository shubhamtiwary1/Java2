import java.util.Scanner;
public class Q14 {
	public static int fibo(int s){
		if(s == 0 || s == 1) {
			return s; 
		}
		return fibo(s-1)+fibo(s-2);
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Ente the number: ");
		int s = sc.nextInt();
		int r = Q14.fibo(s);
		System.out.print(r);
	}

}
