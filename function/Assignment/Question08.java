package Assignment;
// Overloading the methods for area calculation
import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		int r = src.nextInt();
		Area(r);
		System.out.println("Enter the length and breadth of the rectangle:");
		int length = src.nextInt();
		int breadth = src.nextInt();
		Area(length, breadth);
		System.out.println("Enter the base and height of the triangle:");
		int base = src.nextInt();
		int height = src.nextInt();
		Area(base, height, true);

		src.close();
	}
	public static void Area(int r) {
		double area = Math.PI * r * r;
		System.out.println("Area of the circle: " + area);
	}
	public static void Area(int length, int breadth) {
		int area = length * breadth;
		System.out.println("Area of the rectangle: " + area);
	}
	public static void Area(int base, int height, boolean isTriangle) {
		if (isTriangle) {
			double area = 0.5 * base * height;
			System.out.println("Area of the triangle: " + area);
		}
	}
}
