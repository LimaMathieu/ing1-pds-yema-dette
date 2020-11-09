package tramway;

public class Tramway {

	private int id;
	private int maxCapacity;
	private String state;
	
	
	public Tramway(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	public Tramway() {
		
	}
	@Override
	public String toString() {
		return "Tramway [id=" + id + ", maxCapacity=" + maxCapacity + ", state=" + state + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
