package Banking;

public class Regularcustomer extends customer {
	String customerID;
	String customerName;
	String customerType;
	double amount;
	Regularcustomer(String custId,String custName,String custType,double amt){
		super(custId,custName,custType);
		this.customerID= custId;
		this.customerName=custName;
		this.customerType=custType;
		this.amount=amt;
	}
	double get_final_amount(double Interest,int year) {
		double simple_interest=this.amount*Interest*year;
		double amount=this.amount*simple_interest;
		
		if(this.customerType=="Domestic") {
			return amount-500;
		}
		else if(this.customerType=="Bussiness") {
			return amount;
		}
		return amount;
		
	}
	}


