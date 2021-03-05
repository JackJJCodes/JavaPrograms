class Book {
	@SuppressWarnings("unused")
	private String nameOfBook;
	private String authorOfBook;
	private double price;
	
	public Book(String nameOfBook, String authorOfBook, double price)
	{
		this.nameOfBook = nameOfBook;
		this.authorOfBook = authorOfBook;
		this.price = price;
	}
	
	public void issueBook(String nameOfBook, String authorOfBook, double price)
	{
		System.out.println("Thank you for buying the book " + nameOfBook + "\nPlease pay " + price + " at the counter.");
	}
}

class ReferenceBook extends Book
{
	@SuppressWarnings("unused")
	private double referralID;
	ReferenceBook(String nameOfBook, String authorOfBook, double price)
	{
		super(nameOfBook, authorOfBook, price);
;	}
	public void issueBook(String nameOfBook, String authorOfBook, double price)
	{
		System.out.println("Thank you for buying the book " + nameOfBook + "\nPlease pay " + price + " at the counter.");
//		System.out.println("The referral code you used is " + referralID);
	}
}

public class BookStore
{
	public static void main(String args[])
	{
		Book b1 = new Book("Murder On The Orient Express",
						   "Agatha Christie", 499);
		
		b1.issueBook("Murder On The Orient Express",
				   "Agatha Christie", 499);
		
		System.out.println("\n\n");
		ReferenceBook r1 = new ReferenceBook("Then There Were None",
											 "Agatha Christie", 499);
		
		r1.issueBook("Then There Were None",
				     "Agatha Christie", 350);
	}
}