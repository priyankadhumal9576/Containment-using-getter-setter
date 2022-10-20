
public class Item 
{
	private int itemId;
	private String itemName;
	private int itemQuantity;
	Supplier s;
	Bill b;
	
	public int getItemId()
	{
		return itemId;
	}
	public void setItemId(int itemId)
	{
		this.itemId = itemId;
	}
	public String getItemName() 
	{
		return itemName;
	}
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}
	public int getItemQuantity() 
	{
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) 
	{
		this.itemQuantity = itemQuantity;
	}
	public Supplier getS()
	{
		return s;
	}
	
	public void setS(Supplier s)
	{
		this.s=s;
	}
	public Bill getB()
	{
		return b;
	}
	public void setB(Bill b)
	{
		this.b=b;
	}
	
	public String toString()
	{
		return "\n"+"The item id is:"+itemId+"\n"+"The quantity of item is:"+itemQuantity+"\n"+"The name of the item is:"+itemName+"\n"+b+"\n"+s;
	}
	
	
  
}
