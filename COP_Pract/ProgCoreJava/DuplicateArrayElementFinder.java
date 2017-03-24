import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;
public class DuplicateArrayElementFinder{
	public static void main(String[] args){	
		List<Integer> intList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 6 integers");
		int[] intArray = new int[6];
		for(int i=0;i<intArray.length;i++){
			intArray[i] = sc.nextInt();
		}
		System.out.println("Entered integers in array: " +intArray);
		Map<Integer,Integer> dupMap = new HashMap<>();
		for(int i=0;i<intArray.length;i++){
			if (!dupMap.containsKey(intArray[i])){
				int dupCount=1;	
				for(int j=i+1;j<intArray.length;j++){
						if(intArray[j]==intArray[i]){
						dupCount++;
					}
					if(dupCount>1){
						dupMap.put(intArray[i],dupCount);
					}
				 }
		    }
		}
		for(Integer key : dupMap.keySet()){
			System.out.println("Dup Number: " +key+ " ,Number of Occurences: " +dupMap.get(key));
		}
	}
}