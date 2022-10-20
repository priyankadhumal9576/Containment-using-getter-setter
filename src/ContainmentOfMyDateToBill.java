
public class ContainmentOfMyDateToBill {

	public static void main(String[] args) 
	{
		MyDate d1=new MyDate();
		d1.setDay(5);
		d1.setMonth(11);
		d1.setYear(2005);
		
		Bill b=new Bill();
		b.setBillAmount(500.00f);
		b.setBillNo(856);
		b.setM(d1);
		
		System.out.println(b);

	}

}
