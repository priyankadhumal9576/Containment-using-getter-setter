
public class Containment1 {

	public static void main(String[] args) 
	{
		Supplier s1=new Supplier();
		s1.setSupplierName("mr kk");
		s1.setSupplierId(45);
		s1.setMobileNo(2356987456l);
		
		MyDate m1=new MyDate();
		m1.setDay(2);
		m1.setMonth(12);
		m1.setYear(2006);
		
		
		Bill b=new Bill();
		b.setBillAmount(500.00f);
		b.setBillNo(545);
	    b.setM(m1);
		
		
		Item i=new Item();
		i.setItemId(45);
		i.setItemName("cloth");
		i.setItemQuantity(2);
		i.setS(s1);
		i.setB(b);
		
		
				
		System.out.println(i);

	}

}
