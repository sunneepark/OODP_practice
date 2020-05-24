package prototypeRetailer;
/**
 * 
 * @author 2016112105 박선희
 * @usage 중간 거래량 고객 
 *
 */
public class MedVolCustomer extends Customer {
	public String type="medium";
	private String name;
	private String companyName;

	public MedVolCustomer(String name, String companyName) {
		super();
		this.name = name;
		this.companyName = companyName;
	}

	@Override
	protected Customer clone(String name, String companyName) {
		return new MedVolCustomer(name, companyName);
	}
	public String getName() {
		return name;
	}
	public String getCompanyName() {
		return companyName;
	}
}
