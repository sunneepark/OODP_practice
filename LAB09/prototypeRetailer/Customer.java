package prototypeRetailer;
/**
 * 
 * @author 2016112105 박선희
 * @propose prototype
 *
 */
public abstract class Customer {
	public String type;
	private String name;
	private String companyName;
	protected abstract Customer clone(String name, String companyName);
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
