import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		System.out.printf("Input your weight in lbs and height in inches\n");
		//Input the weight and height of the user
		Scanner input = new Scanner(System.in);
		int weight = input.nextInt();
		int height = input.nextInt();
		//Calculate the BMI and output it to the user
		System.out.printf("Your BMI is %d\n", (weight*703/(height*height)));

		//Output the table
		System.out.printf("\nBMI VALUES\nUnderweight: Less than 18.5\n");
		System.out.printf("Normal:     between 18.5 and 24.9\n");
		System.out.printf("Overweight: between 25 and 29.9\n");
		System.out.printf("Obese:      30 or greater\n");

	}

}
