package Banking;

public abstract class customer {
	String customerID;
	String customerName;
	String customerType;
	
	customer(String custId, String custName, String custType)
	{
		this.customerID= custId;
		this.customerName=custName;
		this.customerType=custType;

	}
       void showcustomerDetails() {
    	   System.out.println("customerID :"+ this.customerID);
    	   System.out.println("customerName :"+this.customerName);
    	   System.out.println("customerType :"+this.customerType);
	}
       abstract double get_final_amount(double Interest, int year);
       

}
