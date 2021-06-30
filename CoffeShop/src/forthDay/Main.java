package forthDay;

import java.time.LocalDate;


public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new KahveDunyasiCustomerManager(new CustomerCheckManager());
		
		customerManager.save(new Customer(1,"MUHAMMET EMÝN","ÇAÐLAR",2006,"1111111111"));
	
	}

}
