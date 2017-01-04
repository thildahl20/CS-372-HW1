package valueCharacter;
import java.util.Scanner;

public class valueCharacter {

	public static void main(String[] args) {
			output('A');
			output('B');
			output('C');
			output('a');
			output('b');
			output('c');
			output('0');
			output('1');
			output('2');
			output('$');
			output('^');
			output('+');
			output('/');
			output(' ');
		
		}

		private static void output(char x) {
			System.out.printf("The character %c has the value %d.\n", x, (int) x);
		}

	}

