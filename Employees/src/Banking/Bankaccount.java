package Banking;

public class Bankaccount {

	public static void main(String[] args) {
		
		Regularcustomer regcustomer1= new Regularcustomer("R123","krishna","Domestic",10000);
		Regularcustomer regcustomer2= new Regularcustomer("R234","Sonu","Bussiness",10000);
		Enterprisecustomer Entcustomer1= new Enterprisecustomer("R546","Rahul","SmallScale",1000);
		Enterprisecustomer Entcustomer2= new Enterprisecustomer("R564","Kishore","BigScale",1000);
		
		regcustomer1.showcustomerDetails();
		System.out.println("final amount:"+ regcustomer1.get_final_amount(5,0));
		regcustomer2.showcustomerDetails();
		System.out.println("final amount:"+ regcustomer2.get_final_amount(5,0));
		Entcustomer1.showcustomerDetails();
		System.out.println("final amount:"+ Entcustomer1.get_final_amount(5,0));
		Entcustomer2.showcustomerDetails();
		System.out.println("final amount:"+ Entcustomer2.get_final_amount(5,0));
	}
 
}
