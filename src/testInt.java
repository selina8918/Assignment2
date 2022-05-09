interface test{
	void square();
}
class Arithmetic implements test{
	public void square() {System.out.println("This is square");}
}
public class testInt {

	public static void main(String[] args) {
		Arithmetic obj = new Arithmetic();
		obj.square();

	}

}
