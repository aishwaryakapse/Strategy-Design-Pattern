
public class Animal {
	private String name;
	private double height;
	private int weight;
	private String favFood;
	private double speed;
	private String sound;
	
	
	public void setSound(String sound){
		this.sound = sound;
	}
	
	public String getSound(){
		return sound;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	
	public double getHeight(){
		return height;
	}
	
	public void setWeight(int weight){
		this.weight = weight;
	}
	
	public int getWeight(){
		return weight;
	}
	
	public void setFavFood(String favFood){
		this.favFood = favFood;
	}
	
	public String getFavFood(){
		return favFood;
	}
	
	public void setSpeed(double speed){
		this.speed = speed;
	}
	
	public double getSpeed(){
		return speed;
	}
	
	
	public Flys flyingType; //create an instance of the interface
	
	public String tryToFly(){
		return flyingType.fly();
	}
	
	public void setFlyingType(Flys newFlyingType){
		flyingType = newFlyingType;
	}
	
}
