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
		minutes = (total - hours * 3600) / 60;
		seconds = total - hours * 3600 - minutes * 60;
		System.out.println(total + " seconds = " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
		
		
	

	
	}
}
