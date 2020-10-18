package MapArea;

import java.util.Date;

public class Map {
	
	private int nbStation;
	private int id;
	private Area area;
	public int getNbStation() {
		return nbStation;
	}
	public void setNbStation(int nbStation) {
		this.nbStation = nbStation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Area getA() {
		return area;
	}
	public void setA(Area area) {
		this.area = area;
	}

	public Map(int nbStation, Area area) {
		this.nbStation = nbStation;
		this.area = area;
		int i = (int) new Date().getTime();
		this.id = i;
		
	}
	
	public String toString() {
		String message = "This map refers to an area which has an xlong : "+area.getXlong()+" ylong : "+area.getYlong();
		return message;
	}

}
