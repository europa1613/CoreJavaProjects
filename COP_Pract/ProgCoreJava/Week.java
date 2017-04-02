public enum Week{
	SUNDAY("Sun"),MONDAY("Mon"),FRIDAY("Fri");
	private String name;
	Week(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public String toString(){
		return "toString of day of week is : " +name;
	}
}