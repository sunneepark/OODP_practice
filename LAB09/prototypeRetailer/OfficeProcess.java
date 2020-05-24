package prototypeRetailer;
/**
 * 
 * @author 2016112105 박선희
 * @usage using prototype
 *
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class OfficeProcess {
	String inputCompanyName;
	String inputType;
	Scanner sc = new Scanner(System.in);
	private HashMap<String, Customer> customerByTypeList = new HashMap<String, Customer>();
	private List<Customer> customerDB = new ArrayList<Customer>();

	public void register() { // 초기 세팅
		customerByTypeList.put("low", new LoVolCustomer(null, null));
		customerByTypeList.put("medium", new MedVolCustomer(null, null));
		customerByTypeList.put("high", new HiVolCustomer(null, null));
	}

	public void registerCompany() {
		System.out.println("Enter Company Name");
		String companyName = sc.nextLine();
		this.inputCompanyName = companyName;
		System.out.println("Now application would  collect lots more company information...");
	}

	public void registerType() {
		System.out.println(
				"Please pick a type of customer from one of the following : ('medium' will be assumed otherwise)");
		System.out.println(customerByTypeList.keySet());
		String type = sc.nextLine();
		this.inputType = type;
		System.out.println();
	}

	public void registerCustomer() { // customer entry
		System.out.println("Client does some work...\n");

		System.out.println("Client calls on the application of Prototype pattern......");
		System.out.println("Enter Customer names or exit \'-quit\'");

		while (true) {
			String name = sc.nextLine();
			if (name.equals("-quit")) {
				printCustomers();
				break;
			} else {
				System.out.println("...more interaction to get information about " + name + "... : Stored in database");
				Customer result = this.createCustomer(name);
				customerDB.add(result); // 고객 정보 DB 저장

			}
		}

	}

	public Customer createCustomer(String name) {// 등록되어 있는 객체에서 타입명에 해당하는 서브 클래스를 생성, 고객의 이름이 바뀌므로 고객이름 같이 생성
		return ((Customer) (customerByTypeList.get(inputType))).clone(name, inputCompanyName);
	}

	public void printCustomers() {
		System.out.println("The customers entered during this session : ");
		for (Customer elem : customerDB) {
			System.out.println("Customer " + elem.getName() + ", an employee of " + elem.getCompanyName()
					+ ".. Spending category : " + elem.getType() + " volume. Lots more...");
		}
		System.out.println("Client does more work...");
	}

}
