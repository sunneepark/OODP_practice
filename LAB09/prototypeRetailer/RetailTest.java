package prototypeRetailer;

public class RetailTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OfficeProcess mainProcess = new OfficeProcess();

        mainProcess.register();

        mainProcess.registerCompany();
        mainProcess.registerType();
        mainProcess.registerCustomer();
	}

}