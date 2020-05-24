package prototypeRetailer;
/**
 * 
 * @author 2016112105 박선희
 * @usage 낮은 거래량 고객 
 *
 */
public class LoVolCustomer extends Customer {
	public String type = "low";
	private String name;
	private String companyName;

	public LoVolCustomer(String name, String companyName) {
		super();
		this.name = name;
		this.companyName = companyName;
	}

	@Override
	protected Customer clone(String name, String companyName) {
		return new LoVolCustomer(name, companyName);
	}
	public String getName() {
		return name;
	}
	public String getCompanyName() {
		return companyName;
	}
}
