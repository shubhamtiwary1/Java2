import java.util.Scanner;
public class A5Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence to reverse: ");
		String set = sc.nextLine();
		int n = set.length();
		String temp = "";
		for(int i=n; i>0; i--) {	
			if(set.charAt(i) == ' ') {
				for(int j=i; j<n-i; j++) {
					temp = temp + set.charAt(i);
				}
			}
//			else {
//				temp = temp + set.charAt(i);
//			}
		}
		System.out.println(temp);
//		String temp2 = "";
//		for(int i=temp.length(); i>0; i++) {
//			temp2 = temp2 + temp.charAt(i);
//		}
//		System.out.println(temp2);
	}

}
