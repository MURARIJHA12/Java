package Assignment;
// Method to Convert Temperature
import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);

		System.out.println("Choose the conversion type:");
		System.out.println("1: Celsius to Fahrenheit");
		System.out.println("2: Fahrenheit to Celsius");
		int choice = src.nextInt();

		System.out.println("Enter the temperature to convert:");
		double temperature = src.nextDouble();

		if (choice == 1) {

			double result = celsiusToFahrenheit(temperature);
			System.out.println("Temperature in Fahrenheit: " + result);
		} else if (choice == 2) {
			double result = fahrenheitToCelsius(temperature);
			System.out.println("Temperature in Celsius: " + result);
		} else {
			System.out.println("Invalid choice");
		}

		src.close();
	}
	public static double celsiusToFahrenheit(double celsius) {
		return (celsius * 9/5) + 32;
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5/9;
	}
}
