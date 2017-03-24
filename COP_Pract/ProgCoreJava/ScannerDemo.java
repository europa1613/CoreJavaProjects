import java.util.Scanner;

public class ScannerDemo{
	public static void main(String[] args){
		Scanner scnObj = new Scanner(System.in);
		int num=0;
		//Read an int and return its square as long as the int is not 90
		System.out.println("Enter a number");
		while(scnObj.hasNextInt()){	
				num = scnObj.nextInt();
				if(num!=90){
				System.out.println("Square of entered number is: " +(num*num));
				}else{
					break;
				}
			}
		
		//skip the current line
		scnObj.nextLine();
		
		//Read a line of text
		System.out.println("Enter a line of text");
		//String line = scnObj.nextLine();
		String line = scnObj.next();
		System.out.println("You entered: " +line);
		System.out.println("You entered using next(): " +line);
		
		//Read a char
		System.out.println("Enter a char");
		String str = scnObj.next();
		char ch = str.charAt(0); // reads the input as string and returns the 1st char
		System.out.println("Entered char is: " +ch);
		
		scnObj.close();
	}
}