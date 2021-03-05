class Animal{} 

class Dog1 extends Animal
{	//Dog inherits Animal 
	public void print()
	{
		System.out.println("Hello");
	}
		public static void main(String args[]){  
		Dog1 d=new Dog1();  
		System.out.println(d instanceof Animal);//true  
}  
} 