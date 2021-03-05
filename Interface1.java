interface Animal
{
	void sound();
	void speed();
}

interface FastAnimal
{
	void run();
}

class Tiger implements Animal, FastAnimal
{
	public void sound()
	{
		System.out.println("Roar");
	}
	public void speed()
	{
		System.out.println("Speed is high.");
	}
	public void run()
	{
		System.out.println("It is a fast animal.");
	}
}

// Driver class
class Interface1 {
	public static void main(String args[])
	{
		Tiger t1 = new Tiger();
		t1.sound();
		t1.speed();
		t1.run();
	}
}
