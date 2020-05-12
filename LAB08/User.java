/**
 * 
 * @author 2016112105 박선희
 * @purpose User의 firstname과 lastname만 있어도 유저 객체 생성 가능
 * @using Builder 패턴
 *
 */
public class User {
	private String firstName; // required
	private String lastName; // required
	private int age; // optional
	private String phone; // optional
	private String address; // optional

	private User(String firstName, String lastName, int age, String phone, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}

	public static class Builder {
		private String firstName; // required
		private String lastName; // required
		private int age; // optional
		private String phone; // optional
		private String address; // optional

		public Builder(String firstName, String lastName) { //first name 과 lastname 은 필수, 없으면 빌드 생성 불가능
			this.firstName = firstName;
			this.lastName = lastName;
		}
		//optional 필드 추가 setter
		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Builder setPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}
		public User build() {
			User personInfo = new User(firstName, lastName, age, phone, address);
			return personInfo;
		}
	}

	public static void main(String[] args) {
		Builder userSunny = new Builder("sunny","park");
		
		System.out.println(userSunny.build());
		
		userSunny.setAddress("서울시");
		System.out.println(userSunny.build());
		
		User sunny = userSunny.build();
		System.out.println(sunny);
	}

}
