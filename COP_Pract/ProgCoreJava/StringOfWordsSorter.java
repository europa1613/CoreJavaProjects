import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
/****
Read in a string of words from the user, then input each separate word into an array, 
the array needs to then sort the words in alphabetical order, and then print the array. 
****/
public class StringOfWordsSorter {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Please give some input");
		String inputStr = input.nextLine();
		input.close();
		StringTokenizer strTokenzr = new StringTokenizer(inputStr);		
		while(strTokenzr.hasMoreTokens()){
			strList.add(strTokenzr.nextToken());
		}
		Collections.sort(strList);
		System.out.println("Words from user input in sorted order ");
		
		for(String str:strList){
			System.out.println(str);
		}
	}
}