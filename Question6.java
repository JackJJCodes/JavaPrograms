//*******************************************************************************


//							Program by Jackson Jacob(19BAI10049)
	

//*******************************************************************************
class PurchaseItem
{
	private String name;
	private double unitPrice;
	
	PurchaseItem()
	{
		name = "no item";
		unitPrice = 0;
	}
	PurchaseItem(String name, double unitPrice)
	{
		this.name = name;
		this.unitPrice = unitPrice;
	}
	
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return unitPrice;
	}

}

class WeightedItem extends PurchaseItem
{
	private double weight;
	WeightedItem(String name, double unitPrice)
	{
		super(name, unitPrice);
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	public double getWeight()
	{
		return weight;
	}
	public double getPriceWeighted()
	{
		return (getPrice() * weight);
	}
	
	public String toString()
	{
		return (getName() + " @ " + getPrice() + " " + getWeight() + " Kg " + getPriceWeighted() + " Rs");
	}
}

class CountedItem extends PurchaseItem
{
	private int quantity;
	CountedItem(String name, double unitPrice)
	{
		super(name, unitPrice);
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	public double getQuantity()
	{
		return quantity;
	}
	public double getPriceCounted()
	{
		return (quantity * getPrice());
	}
	public String toString()
	{
		return (getName() + " @ " + getPrice() + " " + getQuantity() + " units " + getPriceCounted() + " Rs");
	}
}

public class Question6 
{
	public static void main(String args[])
	{
		WeightedItem w1 = new WeightedItem("Banana", 3.00);
		CountedItem c1 = new CountedItem("Pens", 4.5);
		
		w1.setWeight(1.37);
		c1.setQuantity(10);
		
		System.out.println(w1.toString());
		System.out.println(c1.toString());
		
	}
}
