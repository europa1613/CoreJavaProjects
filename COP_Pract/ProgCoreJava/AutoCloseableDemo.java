class AutoCloseableTest implements AutoCloseable{
	public void close() throws Exception{
		System.out.println("Closing");
	}
}

public class AutoCloseableDemo{
	public static void main(String[] args){
		try(AutoCloseableTest testObj = new AutoCloseableTest()){
			
		}catch(Exception ex){
			System.out.println("File Not Found");
		}
	}
}