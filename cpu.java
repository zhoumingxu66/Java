package CPU;

public class cpu {
	private int speed;
	public String brand;
public  cpu(int speed , String brand){
	this.speed = speed;
	this.brand = brand;
}	
public cpu(String brand){
	this.speed=speed;
	this.brand=brand;
}
public int getSpeed(){
	return speed;
}
public void setSpeed(int speed){
	this.speed=speed;
}
	}


