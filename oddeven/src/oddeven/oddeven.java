package oddeven;
import java.util.Scanner;

public class oddeven {
	public static void main(String[] args){

		System.out.printf("Pick a number\n");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		if (num %2 == 0)
			System.out.printf("Your number is even\n");
		else 
			System.out.printf("Your number is odd\n");
		}
}
