public class MultiDimensionalArrayDemo{
	public static void main(String[] args){
		int[][] intMulti = {{2,3,342},{4,5},{4,54,4,23},{4,6,2}};
		
		for(int row=0;row<intMulti.length;row++){
			for(int col=0;col<intMulti[row].length;col++){
				System.out.print(intMulti[row][col] +"\t");
			}
			System.out.println();
		}
		
		String[][] strMulti = new String[3][];
		strMulti[0] = new String[3];
		System.out.println(strMulti[0][1]);
		
		strMulti[0][2] = "hello";
		System.out.println(strMulti[0][2]);
		
		int[][] testArray = new int[][2];
		System.out.println("testArray element: " +testArray[1][1]);
	}
}