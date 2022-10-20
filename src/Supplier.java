
public class Supplier
{
 private int supplierId;
 private String supplierName;
 private long mobileNo;
public int getSupplierId() 
{
	return supplierId;
}
public void setSupplierId(int supplierId)
{
	this.supplierId = supplierId;
}
public String getSupplierName() 
{
	return supplierName;
}
public void setSupplierName(String supplierName)
{
	this.supplierName = supplierName;
}
public long getMobileNo() 
{
	return mobileNo;
}
public void setMobileNo(long mobileNo) 
{
	this.mobileNo = mobileNo;
}
 public String toString()
 {
	 return "\n"+"The supplier id is:"+supplierId+"\n"+"The supplier name is:"+supplierName+"\n"+"mobile number is:"+mobileNo;
 }
 
	
}
