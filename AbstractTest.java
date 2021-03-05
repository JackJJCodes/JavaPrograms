//abstract superclass / abstract class and abstract method.
abstract class A
{
  abstract void callme(); 	//abstract method declared
  abstract void hello(); 	//	
  void showme() {
	  System.out.println("I am non abstract method of abstract Base class");	//non-abstract method
  }
}

class Abs extends A				//extends means using inheritance
{
  void callme()				//method is redefined.
  {
    System.out.println("Calling...Abs.");
  }
  
  void hello() {
	  System.out.println("Hello I am from Abs");
  }
}
class Bb extends A {
	
	void callme() {								//method is redefined.		
		System.out.println("Calling...Bb.");	
	}
	void hello() {
		System.out.println("Hello I am from Bb");
	}
}
//Driver class
public class AbstractTest {					
	public static void main(String[] args)
	  {
		//A a1 = new A();            //we cannot instantiate the abstract class.
	
	 	Abs abs = new Abs();
	    abs.callme();		// output=?
	    abs.showme();      //calling non-abstract method of abstract class.
	    abs.hello();
	    Bb bb = new Bb(); 			
	    bb.callme();				//output=?
	    bb.showme();				//output=?
	    bb.hello();
	     
	    A a1 = new Abs();			//concept = ?
	    a1.callme();				//output = ?	from Abs
	    a1 = new Bb();				//concept = ? 
	    a1.callme();				//output from Bb
	    
	    //b.show();
	  }
}
