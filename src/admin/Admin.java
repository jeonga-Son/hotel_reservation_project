package admin;

public class Admin {
	private String admId;
	private String admPw;
	
	public Admin() {}

	public Admin(String admId, String admPw) {
		super();
		this.admId = admId;
		this.admPw = admPw;
	}

	public String getAdmId() {
		return admId;
	}

	public void setAdmId(String admId) {
		this.admId = admId;
	}

	public String getAdmPw() {
		return admPw;
	}

	public void setAdmPw(String admPw) {
		this.admPw = admPw;
	}
	
}
