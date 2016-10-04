package model;


public class PriceInfo
{

	private double price;
	
	private String currencyCode;
	
	
	public PriceInfo(double inPrice, String inCurrencyCode)
	{
		this.price = inPrice;
		this.currencyCode = inCurrencyCode;
	}


	public double getPrice()
	{
		return price;
	}


	public void setPrice(double price)
	{
		this.price = price;
	}


	public String getCurrencyCode()
	{
		return currencyCode;
	}


	public void setCurrencyCode(String currencyCode)
	{
		this.currencyCode = currencyCode;
	}

	
	
}
