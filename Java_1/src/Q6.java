import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int d = sc.nextInt();
		int a = 444884;
		int freq = 0;
		while(a>0){
			if(a%10 == d){
				freq++;
			}
			a = a/10;
		}
		System.out.println(freq);
	}
}
