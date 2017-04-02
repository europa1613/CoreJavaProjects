import java.io.*;
import java.util.*;

public class EmployeeSerialization{
	public static void main(String[] args){
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Employee.txt"))){
			/**EmployeeForSerialization emp1 = new EmployeeForSerialization(23,"Jon");
			EmployeeForSerialization emp2 = new EmployeeForSerialization(4,"Amy");		
			oos.writeObject(emp1);
			oos.writeObject(emp2);**/
			List<EmployeeForSerialization> empList = new ArrayList<EmployeeForSerialization>();
			empList.add(new EmployeeForSerialization(45,"Bill"));
			empList.add(new EmployeeForSerialization(56,"Katie"));
			for(EmployeeForSerialization empObj : empList){
				oos.writeObject(empObj);
			}
		}catch(Exception ex){
			System.out.println("Exception thrown");
		}
	}
}