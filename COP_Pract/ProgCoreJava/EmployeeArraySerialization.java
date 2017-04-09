import java.io.*;

public class EmployeeArraySerialization{
	public static void main(String[] args){
		EmployeeForSerialization[]  empArray = {new EmployeeForSerialization(64,"Amy"), new EmployeeForSerialization(86,"Rick"), new EmployeeForSerialization(8,"Lisa")};
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("EmployeeArray.txt"))){
			//oos.writeObject(empArray);
			
			//write the arraylength
			oos.writeInt(empArray.length);
			
			//write one object at a time			
			for(EmployeeForSerialization emp : empArray){
				oos.writeObject(emp);
			}			
					
		}catch(FileNotFoundException fnEx){
			System.out.println("FileNotFoundException");
		}catch(IOException fnEx){
			System.out.println("IOException");
		}
	}
}