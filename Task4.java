import java.util.Scanner;
import java.lang.Math;

public class Task4 {
    public static void main(String[] args) {
       
        int UnknownNumber, UserNumber, TrysCount = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("TASK: Guess number (from 0 to 100).");

        UnknownNumber = (int)Math.floor(Math.random() * 100);

        do {
		TrysCount++;

		System.out.print("Input your number: ");

		UserNumber = input.nextInt();
				
		if (UserNumber > UnknownNumber)
		System.out.println("Ny number is less.");
            
		else if (UserNumber < UnknownNumber)            	
		System.out.println("My number is more.");	 		 		

		else 
		System.out.println("You win!");

        } while (UserNumber != UnknownNumber);

        System.out.println("Number of attempts: " + TrysCount);

    }
}