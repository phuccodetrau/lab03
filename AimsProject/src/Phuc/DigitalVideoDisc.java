package Phuc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDics = 0;
	private int id;
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		nbDigitalVideoDics ++;
		id = nbDigitalVideoDics;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDics ++;
		id = nbDigitalVideoDics;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = "";
		this.length = 90;
		nbDigitalVideoDics ++;
		id = nbDigitalVideoDics;
	}
	@Override
	public String toString() {
		return "DVD - " + this.title + " - " + this.category + " - " + this.director + " - " + this.length + ": " + this.cost + " $";
	}
	
	public boolean isMatch(String title) {
		if(this.title.equals(title)) {
			return true;
		}
		return false;
	}
	
	public boolean isMatch(int id) {
		if(this.id == id) {
			return true;
		}
		return false;
	}
}
