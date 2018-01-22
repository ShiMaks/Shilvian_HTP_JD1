package by.makson.republic;

public class Region {
	
	private String nameRegion = "Default region";
	private City regionalCenter;
	private District districts[];
	private double square = 0.0;
	
	
	public String getNameRegion() {
		return nameRegion;
	}
	public void setNameRegion(String nameRegion) {
		this.nameRegion = nameRegion;
	}
	public City getRegionalCenter() {
		return regionalCenter;
	}
	public void setRegionalCenter(City regionalCenter) {
		this.regionalCenter = regionalCenter;
	}
	public District[] getDistricts() {
		return districts;
	}
	public void setDistricts(District[] districts) {
		this.districts = districts;
	}
	public double getSquare() {
		return square;
	}
	public void setSquare(double square) {
		this.square = square;
	}
	
	
			
}
