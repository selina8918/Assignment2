class Outer{
  String so = ("this is outer class");
	 void display()
	   {
	    System.out.println(so);
	   }
	    
	 void test()
	    {
          Inner inner = new Inner();
            inner.display();
		}
	class Inner{
		String si =("This is inner Class");

		void display(){

			System.out.println(si);

		}
	}
	
public static class Demo  {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.display();
		outer.test();

	}

}