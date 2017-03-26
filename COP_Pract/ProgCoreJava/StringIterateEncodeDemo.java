import java.util.Scanner;

/****
Write a Java program that inputs a message (string) from the user and then displays the message encoded using a “secret code”, as follows if the input message contains only upper-case letters A – Z then the the program should work as follows.
Input: SECRET Output: HVXIVG
If the input string contains a combination of both UPPER and lower case letters then the output should be encoded with mixed case.
Input: SecreT Output: HvxivG
If the input string contains both UPPER and lower case letters plus punctuation like commas or spaces then the program should pass any character which is not an upper or lower case letter through unchanged.
Input: Se,cr;e T Output: Hv,xi;v G
***/
public class StringIterateEncodeDemo{
	
	char[] lowerAlphaArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	char[] upperAlphaArray = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	static StringIterateEncodeDemo encodeDemo;
	StringBuffer sb = new StringBuffer();
	
	public static void main(String[] args){
		System.out.println("Please enter a string to be encoded");
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		encodeDemo = new StringIterateEncodeDemo();
		String encodedStr = encodeDemo.encodeMessage(inputStr);
		System.out.println("Reversed String: " +encodedStr);
	}
	
	public String encodeMessage(String userInput){			
		for(int i=0;i<userInput.length();i++){
			boolean isPresent = false;
			char ch = userInput.charAt(i);
			if(ch >='A' && ch <='Z'){
				encodeDemo.encodeCharacters(ch,"upper",isPresent);
			}else{
				encodeDemo.encodeCharacters(userInput.charAt(i),"lower",isPresent);
			}			
		}
		return sb.toString();
	}
	
	public void encodeCharacters(char inputChar, String alphaCase, boolean isPresent){
		char[] lookupArray = new char[26];
		if(alphaCase.equals("lower")){
			lookupArray = lowerAlphaArray;
		}else{
			lookupArray = upperAlphaArray;
		}
		for(int j=0;j<lookupArray.length;j++){				
					if(inputChar == lookupArray[j]){
						//System.out.println("userInput.charAt(i): " +userInput.charAt(i)+ ",		lookupArray[j]: " +lookupArray[j]);
						isPresent = true;
						int reverseIndex = 25-j;
						sb.append(lookupArray[reverseIndex]);
						break;
				}
			}
		if(!isPresent){
				sb.append(inputChar);
			}	
	}
	
}