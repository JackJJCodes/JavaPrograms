final class Person { //class should be final
final int pan; //member should be final
public Person(int p)
{
this.pan = p;
}
int getPan() {
return pan;
}
// No Setter methods are allowed in immutable classes.
}
class Immutable {

 public static void main(String[] args) {
Person p = new Person(123456);
System.out.println(p.getPan());
//p.pan = 896547; // we can't change the values
System.out.println("Now "+p.getPan());
}
}