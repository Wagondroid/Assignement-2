import java.util.Scanner;

public class Decrypt {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a four digit number to decrypt: ");
		String numStr = sc.nextLine();
		int num = Integer.parseInt(numStr);
		if(num < 0 || num > 9999 || numStr.length() != 4) {
			System.out.println("Invalid Input.");
		}
		
		int digit1000 = Integer.parseInt(numStr.charAt(0)+"");
		int digit100 = Integer.parseInt(numStr.charAt(1)+"");
		int digit10 = Integer.parseInt(numStr.charAt(2)+"");
		int digit1 = Integer.parseInt(numStr.charAt(3)+"");
		
		if(digit1000 >= 0  && digit1000 <= 6) {
			digit1000 = (digit1000 + 10) - 7;
		}
		else {
			digit1000 = (digit1000 - 7);
		}
		if(digit100 >= 0  && digit100 <= 6) {
			digit100 = (digit100 + 10) - 7;
		}
		else {
			digit100 = (digit100 - 7);
		}
		if(digit10 >= 0  && digit10 <= 6) {
			digit10= (digit10 + 10) - 7;
		}
		else {
			digit10 = (digit10 - 7);
		}
		if(digit1 >= 0  && digit1 <= 6) {
			digit1 = (digit1 + 10) - 7;
		}
		else {
			digit1 = (digit1 - 7);
		}
		
		System.out.println("Decrypted digit: " + (digit10*1000 + digit1*100 + digit1000*10 + digit100));
	}
}