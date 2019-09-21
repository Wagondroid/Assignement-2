import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to BMI Calculator");
		String option;
		double bmi;
		do {
			System.out.println("Enter a scale to calculate BMI('lb' or 'kg')?");
			option = sc.nextLine();
			if(!option.toLowerCase().equals("lb") && !option.toLowerCase().equals("kg")) {
				System.out.println("Invalid Choice! Try Again!");
			}
		}while(!option.toLowerCase().equals("lb") && !option.toLowerCase().equals("kg"));
		
		if(option.toLowerCase().equals("lb")) {
			System.out.print("Enter weight in pounds: ");
			double weight = sc.nextDouble();
			System.out.print("Enter height in inches: ");
			double height = sc.nextDouble();
			bmi = (703.0*weight)/(height*height);
		}
		else {
			System.out.print("Enter weight in kgs: ");
			double weight = sc.nextDouble();
			System.out.print("Enter height in meters: ");
			double height = sc.nextDouble();
			bmi = (weight)/(height*height);
		}
		System.out.println("Your BMI: " + bmi);
		if(bmi <= 18.5) {
			System.out.println("Category: Underweight");
		}
		else if(bmi > 18.5 && bmi < 25) {
			System.out.println("Category: Normal Weight");
		}
		else if(bmi >= 25 && bmi < 30) {
			System.out.println("Category: Overweight");
		}
		else if(bmi >= 30) {
			System.out.println("Category: Obesity");
		}
	}
}
