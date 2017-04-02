public class StringFormattingDemo{
	public static void main(String[] args){
		float fl = 234.2354f;
		System.out.format("No format specifier: %f\n", fl);
		System.out.format("5.1f: %5.1f\n", fl);
		System.out.format("7.2f: %7.2f\n", fl);
		System.out.format("1.2f: %1.2f\n", fl);
		System.out.format("-2.2f: %-2.2f\n", fl);
		System.out.format("-7.6f: %-7.6f\n", fl);
		System.out.format("10.2f: %10.2f\n", fl);
		System.out.format("-1.1f: %-1.1f\n", fl);
		
		int i = 45906845;
		System.out.format("Integer: %d\n", i);
		System.out.format("2d: %2d\n", i);
		System.out.format("10d: %10d\n", i);
		System.out.format("6d: %6d", i);
	}
}