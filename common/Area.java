package MapArea;

public class Area {
	
	private int xlong;
	private int ylong;

	public int getXlong() {
		return xlong;
	}
	public void setXlong(int xlong) {
		this.xlong = xlong;
	}
	public int getYlong() {
		return ylong;
	}
	public void setYlong(int ylong) {
		this.ylong = ylong;
	}

	public Area(int x, int y) {
		this.xlong = x;
		this.ylong = y;
	}
	
	public String toString() {
		String message = "This area's dimension are xlong : "+xlong+" ylong : "+ylong;
		return message;
	}
}
