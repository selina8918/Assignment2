interface A{
	void meth1();
	void meth2();
}
class myClass implements A{
	 public void meth1() { System.out.println("hello everyone");}
      public void meth2() {System.out.println("how are you");}
}
public class Interface {

	public static void main(String[] args) {
		A d = new myClass();
		d.meth1();
		d.meth2();

	}

}
