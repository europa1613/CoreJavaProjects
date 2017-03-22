public class DataTypesDemo{
	public static void main(String[] args){
		int i = 30;
		short s = 321;
		long l = 9147385739L;
		double d = 24.35354356546547547755645643; //precision upto 15 decimal points and then rounds off
		float f = 64.24565675565765765786767f; //precision upto 5 decimal points and then rounds off
		
		System.out.println(i);
		System.out.println(s);
		System.out.println(l);
		System.out.println(d);
		System.out.println(f);
		
		//'byte' min value: -128, max value: 127
		System.out.println("'byte' min value: " +Byte.MIN_VALUE+ ", max value: " +Byte.MAX_VALUE);
		
		//'integer' min value: -2147483648, max value: 2147483647
		System.out.println("'integer' min value: " +Integer.MIN_VALUE+ ", max value: " +Integer.MIN_VALUE);
				
		int a = Integer.MAX_VALUE;
		//since a has crossed max limit, a wil start taking the negative range i.e it keeps going circular in its range i.e -2,147,483,648 to +2,147,483,647
		a=a+1;//-2147483648
		System.out.println("One added: " +a);
		a=a+2147483647;//-1
		System.out.println("Max value added: " +a);
		a=a+2;//1
		System.out.println("2 added after adding the max value: " +a);
		a=a+4;//5
		System.out.println("One added after adding the max value: " +a);
		
		//Other datatypes
		/***
		'long' min value: -9223372036854775808, max value: 9223372036854775807
		'short' min value: -32768, max value: 32767
		'double' min value: 4.9E-324, max value: 1.7976931348623157E308
		'float' min value: 1.4E-45, max value: 3.4028235E38
		***/
		System.out.println("'long' min value: " +Long.MIN_VALUE+ ", max value: " +Long.MAX_VALUE);
		System.out.println("'short' min value: " +Short.MIN_VALUE+ ", max value: " +Short.MAX_VALUE);
		System.out.println("'double' min value: " +Double.MIN_VALUE+ ", max value: " +Double.MAX_VALUE);
		System.out.println("'float' min value: " +Float.MIN_VALUE+ ", max value: " +Float.MAX_VALUE);
		
		//byte b=813;//throws error "incompatible types,possible lossy conversion"
		int i1 = 813;
		System.out.println("int before converting to byte b: " +i1);
		byte b = (byte)813; //moves the bits of 813 from right to left into b as many as b can hold. Then returns the number corresponding to the binary representation that was successfully stored in b 
		System.out.println("byte b: " +b); //45 - coz 00101101 is stored
		
		long l1 = 214748364778L; //need to append L to indicate to the compiler that l1 needs to be taken as long
		System.out.println("long l1 before  converting to int: " +l1);
		int i2 = (int)l1;
		System.out.println("int from long: " +i2); //-22
		
		char ch='c';
		String str="test";
		int i3=60;
		System.out.println(str+ch); //testc
		System.out.println(str+i3); //test60
		System.out.println(ch+i3);//adds 60 with the ascii value of 'c' = 99+60=159
	}
}