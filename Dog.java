
public class Dog extends Animal{
	
	public Dog(){
		super();
		setSound("Bark");
		setHeight(12.55);
		setWeight(30);
		setSpeed(20.5);
		flyingType = new CantFly();
	}
	
	public void digHole(){
		System.out.println("Dug a Hole");
	}
}
