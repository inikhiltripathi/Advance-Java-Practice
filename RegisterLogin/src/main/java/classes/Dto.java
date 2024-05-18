package classes;

public class Dto {
	
	private String name,mobile,email,uname,pass;
	
	public Dto() {}
	

	public Dto(String name, String mobile, String email, String uname, String pass) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.uname = uname;
		this.pass = pass;
	}


	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public String getMobile() {return mobile;}
	public void setMobile(String mobile) {this.mobile = mobile;}

	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}

	public String getUname() {return uname;}
	public void setUname(String uname) {this.uname = uname;}

	public String getPass() {return pass;}
	public void setPass(String pass) {this.pass = pass;}
	
	
	
	

}
