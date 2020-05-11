package name;

//Basics 3
/**
 * 
 * @author 2016112105 박선희
 * @date 20/03/17
 *
 */
public class Name {
  private String firstName;
  private String middleName;
  private String lastName;

  public Name(String fName, String mName, String lName) {
		firstName = fName;
		middleName = mName;
		lastName = lName;
  }
  
  public String getFirstName() {return firstName; }
  public String getMiddleName() { return middleName; }
  public String getLastName() {return lastName; }
 
  public void setFirstName(String fn) {
	  firstName = fn;
  }
  public void setMiddleName(String mn) {
	   middleName = mn;
  }
  public void setLastName(String ln) {
	  lastName = ln;
  }
  
  public String getFirstAndLastName() {
		return firstName + " " + lastName;
  }
  
  public String getLastCommaFirst() {
		return lastName + ", "+ firstName;
  }
  //이니셜 가져오는 메소드
  public String getInits() {return firstName.substring(0,1) + ((middleName.length() > 0) ? middleName.substring(0,1):"")
		  + lastName.substring(0,1);}
  
  //가운데 줄 출력 메소드(First Name + 공백  +  Middle Name 이니셜 + 공백 + Last Name)
  @Override
  public String toString() {
	  return firstName + " " + ((middleName.length() > 0) ? middleName.substring(0,1)+" ":"") + lastName;
  }
  
}

