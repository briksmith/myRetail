package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "movies", schema = "BriansDB@cassandra_pu")
public class Product
{
	
	@Id
	private int id;
	
	@Column(name="current_price")
	private PriceInfo priceInfo;
	
	@Column(name="name")
	private String name;
	
	public Product()
	{
		
	}
	
	public Product(int inId, String inName, double inPrice, String inCurrencyCode){
		this.id = inId;
		this.name = inName;
		this.priceInfo = createPriceInfo(inPrice, inCurrencyCode);
	}

	private PriceInfo createPriceInfo(double inPrice, String inCurrencyCode)
	{
		return new PriceInfo(inPrice, inCurrencyCode);
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public PriceInfo getPriceInfo()
	{
		return priceInfo;
	}

	public void setPriceInfo(PriceInfo priceInfo)
	{
		this.priceInfo = priceInfo;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
