class AccessClass
{
	public void showLevelPublic()
	{
		System.out.println("This is the public specifier.\n");
	}
	
	protected void showLevelProtected()
	{
		System.out.println("This is the protected specifier.\n");
	}
	
	@SuppressWarnings("unused")
	private void showLevelPrivate()
	{
		System.out.println("This is the private specifier.\n");
	}
	
	void showLevelDefault()
	{
		System.out.println("This is the default specifier.\n");
	}
}

class ProtectedDemo
{
	ProtectedDemo obj_protect = new ProtectedDemo();
	void showProtected()
	{
		obj_protect.showLevelProtected();
		System.out.println("This class consists of the protected class.\n");
	}
}

public class accessModifiers {
	public static void main(String args[])
	{
		AccessClass obj = new AccessClass();
		ProtectedDemo obj_p = new ProtectedDemo();
		
		obj.showLevelPublic();
		obj.showLevelDefault();
		obj.showLevelProtected();
		obj_p.showProtected();
//		obj.showLevelPrivate(); // Not accessible
	}
}
