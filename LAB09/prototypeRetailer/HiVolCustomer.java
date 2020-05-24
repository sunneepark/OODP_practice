package prototypeRetailer;
/**
 * 
 * @author 2016112105 박선희
 * @usage 높은 거래량 고객 
 *
 */
public class HiVolCustomer extends Customer {
	public String type="high";
	private String name;
	private String companyName;
	
	public HiVolCustomer(String name, String companyName) {
		super();
		this.name = name;
		this.companyName = companyName;
	}

	@Override
	protected Customer clone(String name, String companyName) {
		return new HiVolCustomer(name, companyName);
	}
	public String getName() {
		return name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public String getType() {
		return type;
	}
}
