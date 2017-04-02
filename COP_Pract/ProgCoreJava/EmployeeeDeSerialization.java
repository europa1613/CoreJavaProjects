import java.io.*;

public class EmployeeeDeSerialization{
	public static void main(String[] args){
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Employee.txt"))){
			Object obj = null;
			while((obj = ois.readObject())!=null){
				/**
			EmployeeForSerialization emp1 = (EmployeeForSerialization)ois.readObject();
			EmployeeForSerialization emp2 = (EmployeeForSerialization)ois.readObject();		
			System.out.println(emp1);
			System.out.println(emp2);
			**/
			System.out.println(obj);
			}
		}catch(EOFException ex){ //doesnt return null when there are no more objects, instead throws EOF Exception
									// hence just catch it and handle accordingly
			System.out.println("End of File");
		}catch(Exception ex){
			System.out.println("Exception thrown");
			ex.printStackTrace();
		}
	}
}