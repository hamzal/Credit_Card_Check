//Hamza Lemsaddek
package Credit_Card_Check;

import java.util.Scanner;

public class Credit_Card_Against_Check_Digit {

	public static void main(String[] args) {

		Scanner entry = new Scanner(System.in);

		System.out.print("Please enter the Card # you want to check : ");

		String input = entry.nextLine();

		if (Luhn_test(input) == true) {
			System.out.println("The card number is Valid");
		} else {
			System.out.println("The card number is not Valid");
		}
		entry.close();
	}

	public static boolean Luhn_test(String input) {
		//Getting the Check Digit
		int check_digit = input.charAt(15) - '0';
		// Making the input an array of digits
		int[] digits = new int[input.length()];
		
		for (int i = 0; i < input.length()-1; i++) {
			digits[i] = input.charAt(i) - '0';
		}
		//Indexes of the evens
		int[] evens = { 0, 2, 4, 6, 8, 10, 12, 14 };
		// Doubling the evens
		for (int i : evens) {
			digits[i] = 2 * digits[i];
		}
		//Getting the digits
		for (int i : evens) {
			if (9 < digits[i]) {
				digits[i] = (digits[i] / 10) + (digits[i] % 10);
			} else {
				digits[i] = digits[i];
			}
		}
		//Getting the sum of the digits
		int sum =0;
		//int[] used_digits_ind = { 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		for (int i : digits){
			sum +=i;
		}
		//Multiplying by 9
		int multiplied_sum=sum*9;
		//Get the supposed last digit
		int correct_check_digit = multiplied_sum % 10;
		//Comparing the given check digit to the supposed one
		if ( correct_check_digit == check_digit) {
		return true;
		}
		else{
			return false;
		}
		}
	}
