
public class Bird extends Animal{
	
	public Bird(){
		super();
		setSound("Tweet");
		setHeight(3.5);
		setWeight(5);
		setSpeed(14.8);
		flyingType = new ItFlys();
	}

	public void sing(){
		System.out.println("Birds are Singing");
	}
}
