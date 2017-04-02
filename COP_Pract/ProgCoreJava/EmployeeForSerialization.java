import java.io.*;

public class EmployeeForSerialization implements Serializable{
	int id;
	String name;
	
	EmployeeForSerialization(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	public String toString(){
		return "Emp Name: " +name+ ",id: " +id;
	}
}