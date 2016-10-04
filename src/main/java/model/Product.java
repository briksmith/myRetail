package model;

public class Product
{
	
	private int id;
	private String name;
	private double price;
	private String currencyCode;
	
	public Product(int inId, String inName, double inPrice, String inCurrencyCode){
		this.id = inId;
		this.name = inName;
		this.price = inPrice;
		this.currencyCode = inCurrencyCode;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public double getPrice()
	{
		return price;
	}

	public String getCurrencyCode()
	{
		return currencyCode;
	}

}
