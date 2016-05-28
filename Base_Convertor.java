import java.util.Scanner;

public class Base_Convertor {

	protected static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Please Enter the Current Base of your number: ");
		int origainalBase = in.nextInt();
		System.out.println("Please Enter the Number: ");
		int input = in.nextInt();
		System.out.println("Please Enter the Base you wish to convert to: ");
		int newBase = in.nextInt();

		System.out.println(convertToBase(originalBase, newBase, input));
	}

	public static String
	convertToBase(int originalBase, int newBase, int input){

		if(originalBase == 10 && newBase == 2)
			return Integer.toBinaryString(input);

		else if(originalBase == 10 && newBase == 16)
			return Integer.toHexString(input).toUpperCase();

		else if(originalBase == 10 && newBase == 8)
			return Integer.toOctalString(input);

		else {


			try {
				return Integer.toString(Integer.parseInt(Integer.toString(input), originalBase), newBase).toUpperCase();
			}

			catch (Exception e) {
				System.err.println("The number " + input + " cannot be converted from base " + originalBase + " to base " + newBase);
				return "";
			}

		}

	}

}
