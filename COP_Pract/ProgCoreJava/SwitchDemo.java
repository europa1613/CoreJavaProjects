import java.util.Scanner;

public class SwitchDemo{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter your choice");
		
		int choice = scnr.nextInt();
		switch(choice){
			case 1:
				System.out.println("Chocolate");
				//break;
				//default can be anywhere
				//when there is no break, ther is a fall over and all the steps are executed until either a break or end of loop is encountered. case is just a label
				default:
				System.out.println("Invalid choice");
			case 2:
				System.out.println("Ice Cream");
				break;
			case 3:
				System.out.println("Smoothie");
				break;
			case 4:
				System.out.println("Gelato");
				//break;
			//default:
				//System.out.println("Invalid choice");
		}
	}
}