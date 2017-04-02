public class InnerClassDemo{
	private int outerInt = 21;
	public static void main(String[] args){		
		InnerClassDemo outerClsObj = new InnerClassDemo();
		//creating inner non-static class's object
		InnerClassDemo.InnerClass1 innerCls = outerClsObj.new InnerClass1();
		//accessing inner class's private method.
		//innerCls.printInt(2);
		//accessing and modifying inner cls vrbl and then calling inner cls's private method
		innerCls.innerInt = 40;
		innerCls.printInt(innerCls.innerInt);	
		
		//accessing static nested cls
		InnerClassDemo.NestedStaticClass nestedStaticObj = new InnerClassDemo.NestedStaticClass();
		nestedStaticObj.staticPrint();
	}
	
	private void outerPrintInt(int i){
		System.out.println("outerInt passed from inner cls: " +i);
	}
	
	//Inner class
	class InnerClass1{
		int innerInt = 10;		
		private void printInt(int innerInt){
			System.out.println("innerInt printed from inner cls: " +innerInt);
			//modifying outer/enclosing cls's private vrbl
			outerInt = 12;
			//accessing outer cls's private method
			outerPrintInt(outerInt);
		}		
	}
	
	//since static classes can access only static data, this cls can access only static data of enclosing
	//class. But as per the definition of an inner cls, an inner cls should be able to access all the
	// data of the enclosing cls. Hence this static cls is called static nested cls instead of static 
	// inner class.
	static class NestedStaticClass{
		public void staticPrint(){
			System.out.println("From NestedStaticClass's staticPrint");
		}
	}
}