package in.abc;

class Database {
	private String server;
	private String username;
	private String password;

	private Database(){}
	
	//private static field
	private static Database single; 
	
	//Singleton method
	
	public static Database getInstance()
	{
		if(single == null){
			single = new Database();
			single.server = "123.2.3.22";
			single.username="scott";
			single.password="tiger";
		}
		return single;
	}
	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

public class SingleTon {

	public static void main(String[] args) {
     Database db = Database.getInstance();
     System.out.println(db);
     System.out.println(Database.getInstance());
		
	}

}
