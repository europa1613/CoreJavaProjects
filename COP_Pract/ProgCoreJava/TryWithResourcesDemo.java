import java.io.*;

public class TryWithResourcesDemo{
	public static void main(String[] args){
		File file = new File("resources\\test.txt");
				
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			
			while((line=br.readLine()) != null){
				System.out.println(line);
			}
			
		}catch(FileNotFoundException fileEx){
			System.out.println("FIle not found");
		}catch(IOException ioEx){
			System.out.println("IO Exception");
		}
	}
}