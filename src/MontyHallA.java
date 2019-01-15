import java.util.Random;
import java.util.Scanner;

public class MontyHallA {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner kb = new Scanner(System.in);
		int winDoorNum = rand.nextInt(3) + 1;
		int goatDoorNum;
		int winStatus;
		int doorNum = winDoorNum;
		while(doorNum == winDoorNum) {
			doorNum = rand.nextInt(3) + 1;
		}
		
		System.out.println("How many rounds should be simulated?");
		int roundCount = Integer.parseInt(kb.nextLine());
		int wincount = 0;
		
		String playerSwitch = "-";
		System.out.println("Should the player \"stay\" or \"switch\"?");
		playerSwitch = kb.nextLine();
		while (!(playerSwitch.equals("switch")) && !(playerSwitch.equals("stay"))) {
			System.out.println("Should the player \"stay\" or \"switch\"?");
			playerSwitch = kb.nextLine();
		}
		
		if(doorNum != 1 && winDoorNum != 1) {
			goatDoorNum = 1;
			System.out.println("There is a goat behind door #1!");
		} else if(doorNum != 2 && winDoorNum != 2) {
			goatDoorNum = 2;
		} else if(doorNum != 3 && winDoorNum != 3) {
			goatDoorNum = 3;
		}
		System.out.print("Would you like to change your pick? ");
		String switchStr =  kb.nextLine();
		if(switchStr.charAt(0) == 'Y' || switchStr.charAt(0) == 'y') {
			if(doorNum == winDoorNum) {
				winStatus = 0;
				System.out.println("The car was behind door #" + winDoorNum + "!");
				System.out.println("You lost.");
			} else {
				winStatus = 0;
				System.out.println("The car was behind door #" + winDoorNum + "!");
				System.out.println("You won.");
			}
		} else if(switchStr.charAt(0) == 'N' || switchStr.charAt(0) == 'n'){
			if(doorNum == winDoorNum) {
				winStatus = 0;
				System.out.println("The car was behind door #" + winDoorNum + "!");
				System.out.println("You won.");
			} else {
				winStatus = 0;
				System.out.println("The car was behind door #" + winDoorNum + "!");
				System.out.println("You lost.");
			}
		} else {
			System.out.println("Invalid response");
		}
	}

}
