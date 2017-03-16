
public class AnimalPlay {

	public static void main(String[] args) {
		Animal sparky = new Dog();
		sparky.setName("sparky");
		Animal tweety = new Bird();
		tweety.setName("tweety");
		
		System.out.println("Dog :"+sparky.tryToFly());
		
		System.out.println("Bird :"+tweety.tryToFly());
		
		Dog d = new Dog();
		d.digHole();
		
		Bird b = new Bird();
		b.sing();
		
		sparky.setFlyingType(new ItFlys());
		
		System.out.println("After setting flying type of Dog :"+sparky.tryToFly());
		
		
	}

}
