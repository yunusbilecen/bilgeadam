import java.util.Locale;
import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH);
		
		double weight = 0, height = 0;
		
		System.out.println("Please enter the your weight : ");
		weight = input.nextDouble();
		
		System.out.println("Please enter the your height  : ");
		height = input.nextDouble();
		
		double result = (weight / (height * height));
		
		if(result < 18.5) {
			System.out.println("Your body mass index is underweight. Result : "+ result);
		}else if(result >= 18.5 && result < 24.9) {
			System.out.println("Your body mass index is normal. Result : "+ result);
		}else if(result >= 25.0 && result < 29.9) {
			System.out.println("Your body mass index is overweight. Result :"+ result );
		}else {
			System.out.println("Your body mass index is very overweight. Result : "+ result);
		}
	}
	

}
