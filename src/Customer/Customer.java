package Customer;

public class Customer {
	private String cusName;
	private String phoneNo;
	private String birth;
	private String eamil;
	
	public Customer() {}

	public Customer(String cusName, String phoneNo, String birth, String eamil) {
		super();
		this.cusName = cusName;
		this.phoneNo = phoneNo;
		this.birth = birth;
		this.eamil = eamil;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getEamil() {
		return eamil;
	}

	public void setEamil(String eamil) {
		this.eamil = eamil;
	}
	
}
