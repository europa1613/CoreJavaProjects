public class ArrayOfObjectsDemo{
	public static void main(String[] args){
		ArrayObject[] empArray = new ArrayObject[3];
		empArray[0]=new ArrayObject("John",1);
		empArray[1]=new ArrayObject("Wick", 2);
		empArray[2]=new ArrayObject("Smith",3);
		for(ArrayObject empObj : empArray){
			System.out.println("ID: " +empObj.id);
		}
		
		System.out.println("2nd employee name: " +empArray[1].name);
	}
}