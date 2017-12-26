package taxipark;

public class AutoEquipment {
	
	private String brandName;
	private float costCar;
	private float fuelСonsumption;
	private int maxSpeed;
	
	public AutoEquipment() {
		this.brandName = "Brand";
		this.costCar = 1.0f;
		this.fuelСonsumption = 1.0f;
		this.maxSpeed = 100;
	}
	
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public float getCostCar() {
		return costCar;
	}
	public void setCostCar(float costCar) {
		this.costCar = costCar;
	}
	public float getFuelСonsumption() {
		return fuelСonsumption;
	}
	public void setFuelСonsumption(float fuelСonsumption) {
		this.fuelСonsumption = fuelСonsumption;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
	
	

}
