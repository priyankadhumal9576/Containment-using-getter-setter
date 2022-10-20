
public class Bill 
{
private int billNo;
private float billAmount;
MyDate m;
public int getBillNo()
{
	return billNo;
}
public void setBillNo(int billNo)
{
	this.billNo = billNo;
}
public float getBillAmount() 
{
	return billAmount;
}
public void setBillAmount(float billAmount)
{
	this.billAmount = billAmount;
}
public MyDate getM() 
{
	return m;
}
public void setM(MyDate m) 
{
	this.m = m;
}

public String toString()
{
	return "The bill number is:"+billNo+"\n"+"The bill amount is:"+billAmount+m;
}


}
