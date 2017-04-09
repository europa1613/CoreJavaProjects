import java.io.*;
import java.util.*;

public class EmployeeArrayDeSerialization{
	public static void main(String[] args){
		//EmployeeForSerialization[]  empArray = {new EmployeeForSerialization(3,"Joe"), new EmployeeForSerialization(43,"Dave"), new EmployeeForSerialization(35,"Iris")};
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("EmployeeArray.txt"))){
			//EmployeeForSerialization[] empArray = (EmployeeForSerialization[])ois.readObject();
			//List<EmployeeForSerialization> empArrayList = new ArrayList<EmployeeForSerialization>(Arrays.asList(empArray));
			
			/**System.out.println("Iterating empArray");
			for(EmployeeForSerialization emp : empArray){				
				System.out.println(emp);
			}
			
			System.out.println();
			System.out.println("Iterating empArrayList");
			for(EmployeeForSerialization emp : empArrayList){				
				System.out.println(emp);
			}
			***/
			System.out.println();
			System.out.println("Iterating using array length");
			int num = ois.readInt();
			for(int i=0;i<num;i++){
				EmployeeForSerialization emp = (EmployeeForSerialization)ois.readObject();
				System.out.println(emp);
			}
			
		}catch(FileNotFoundException fnEx){
			System.out.println("FileNotFoundException");
		}catch(IOException fnEx){
			System.out.println("IOException");
			fnEx.printStackTrace();
		}catch(ClassNotFoundException clsNtEx){
			System.out.println("ClassNotFoundException");
		}
	}
}