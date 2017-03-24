import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class DuplicateArrayElementFinder{
	public static void main(String[] args){		
		int[] intArray = {24,24,6,3,6,8,3,2,6,6,856,3};
		List<Integer> dupList = new ArrayList<Integer>();
		Map<Integer,Integer> dupMap = new HashMap<>();
		for(int i=0;i<intArray.length;i++){
			if (!dupList.contains(intArray[i])){
			for(int j=i+1;j<intArray.length;j++){
				if(intArray[j]==intArray[i]){
					int dupCount=0;		
					dupList.add(intArray[i]);
					dupMap.put(intArray[i],++dupCount);
					break;
				}
			 }
		    }else{ 
					int value = dupMap.get(intArray[i]);
					dupMap.put(intArray[i], ++value);
				}
		}
		for(Integer key : dupMap.keySet()){
			System.out.println("Dup Number: " +key+ " ,Count: " +dupMap.get(key));
		}
	}
}