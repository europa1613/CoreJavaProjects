public class EnumDemo{
	public static void main(String[] args){
		Week dayOfWeek = Week.SUNDAY;
		System.out.println(dayOfWeek.getClass());
		System.out.println("name: " +dayOfWeek.name());
		System.out.println(dayOfWeek);
		System.out.println("dayOfWeek instanceOf Enum: " +(dayOfWeek instanceof Enum));
		System.out.println("dayOfWeek instanceOf Object: " +(dayOfWeek instanceof Enum));
		
		switch(dayOfWeek){
			//an enum switch case label must be the unqualified name of an enumeration constant. 
			//case Week.SUNDAY: incorrect
			case SUNDAY:
				System.out.println("Holiday!!");
				break;
			case MONDAY:
				System.out.println("Oh No!! :(  ");
				break;
			case FRIDAY:
				System.out.println("Party Day, yayyy!!! ");
				break;
			default:
				System.out.println("A dull day");
				break;
		}
	}
}