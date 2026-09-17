import java.util.Scanner;
public class Temperature {
	public static void main(String[] args){
		Scanner in = new Scanner (System.in);
		System.out.print("Enter a temperature in Celsius: ");
		double C = in.nextDouble();
		double F;
		F = C * 1.8 + 32;
		System.out.println(C + " C = " + F + " F");
		
		
	

	
	}
}
