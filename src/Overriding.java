   class Parent{
	void show() {System.out.println("parent's show()");}
}
   class child extends Parent{
	@Override
	void show() {System.out.println("child's show()");}
}
public class Overriding {
public static void main(String[] args) {
		
   Parent obj1 =new Parent();
   Parent obj2 = new Parent();
   obj1.show();
   obj2.show();
}
}

