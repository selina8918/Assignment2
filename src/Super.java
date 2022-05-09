class  Vechicle{
	int  maxSpeed =120;
}
class Car extends Vechicle{
	int MaxSpeed = 180;
	void display() {System.out.println("maximum speed: "+super.maxSpeed);}
}
	public class Super {

	public static void main(String[] args) {
		Car small =new Car();
		small.display();
	}

}
