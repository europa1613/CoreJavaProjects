import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class DuplicateArrayElementFinder{
	public static void main(String[] args){		
		int[] intArray = {24,24,6,3,6,8,3,2,6,6,856,3};
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