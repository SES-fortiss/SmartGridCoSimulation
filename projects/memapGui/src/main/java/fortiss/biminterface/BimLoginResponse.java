package fortiss.biminterface;

public class BimLoginResponse {
	
	public String access;
	public String refresh;
	public String accessExpiresAt;
	public String refreshExpiresAt;
	public User user;
	
	class User {

		public String id;
		public String username;
		public Integer roleId;
		public String companyId;
		public String email;
		public Object lastAccess;
		public String phone;
		public Boolean isDeleted;
		public Object photo;
		public String firstName;
		public String lastName;
		public String fullName;
		public Object lastAccessIP;
		public String dateCreated;
		public Object dateModified;
		public Boolean isDarkTheme;
		public String lang;

	}
	
}


