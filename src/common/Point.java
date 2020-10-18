package MapPoint;

public class Point {
	
	private int posX;
	private int posY;
	
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	public Point(int x, int y) {
		this.posX = x;
		this.posY = y;
	}
	
	public String toString() {
		String message = "This point's location is X : "+posX+" Y : "+posY;
		return message;
	}
	
}
