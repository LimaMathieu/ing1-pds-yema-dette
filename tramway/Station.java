package tramway;

public class Station {
	private int id;
	private String address;
	private String name;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		String message = "This station's address is "+address;
		return message;
	}
	
	public Station(String address) {
		this.address = address;
	}
	public Station() {
		
	}
}
