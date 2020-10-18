package MapPoint;

public class Station {
	private String address;

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
}
