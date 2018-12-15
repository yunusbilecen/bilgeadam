import java.util.Scanner;

public class ProductExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int x = 0, y = 0, z = 0;

		System.out.print("Please enter the first number : ");
		x = input.nextInt();
		System.out.println();

		System.out.print("Please enter the second number : ");
		y = input.nextInt();
		System.out.println();

		System.out.print("Please enter the third number : ");
		z = input.nextInt();

		int result = x + y + z;

		System.out.println();
		System.out.println("Product is : " + result);

	}

}
