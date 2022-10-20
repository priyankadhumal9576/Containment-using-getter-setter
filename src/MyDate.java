
public class MyDate
{

	private int month,year,day;

	public int getMonth() 
	{
		return month;
	}

	public void setMonth(int month) 
	{
		this.month = month;
	}

	public int getYear() 
	{
		return year;
	}

	public void setYear(int year) 
	{
		this.year = year;
	}

	public int getDay() 
	{
		return day;
	}

	public void setDay(int day) 
	{
		this.day = day;
	}
	
	public MyDate()
	{
		
	}
	
	public String toString()
	{
		return "\n"+"the year is:"+year+"\n"+"The month is:"+month+"\n"+"The day is:"+day;
	}
}
