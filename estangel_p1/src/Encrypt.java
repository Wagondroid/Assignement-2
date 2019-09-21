import java.util.Scanner;
public class Encrypt {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a four digit number: ");
		String numStr = sc.nextLine();
		int num = Integer.parseInt(numStr);
		if(num < 0 || num > 9999 || numStr.length() != 4) {
			System.out.println("Invalid Input.");
		}
		
		int digit1000 = Integer.parseInt(numStr.charAt(0)+"");
		int digit100 = Integer.parseInt(numStr.charAt(1)+"");
		int digit10 = Integer.parseInt(numStr.charAt(2)+"");
		int digit1 = Integer.parseInt(numStr.charAt(3)+"");
		
		digit1000 = ((digit1000 + 7)%10);
		digit100 = ((digit100 + 7)%10);
		digit10 = ((digit10 + 7)%10);
		digit1 = ((digit1 + 7)%10);
		
		System.out.println("Encrypted digit: " + (digit10*1000 + digit1*100 + digit1000*10 + digit100));
	}
}
