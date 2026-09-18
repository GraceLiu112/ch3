import java.util.Scanner;
public class ConvertTime {
	public static void main(String[] args){
		Scanner in = new Scanner (System.in);
		System.out.print("Enter the number of seconds: ");
		int total = in.nextInt();
		int hours;
		int minutes;
		int seconds;
		hours = total / 3600;
		minutes = (total % 3600) / 60;
		seconds = total % 60;
		System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds", total, hours, minutes, seconds);
	
	}
}
