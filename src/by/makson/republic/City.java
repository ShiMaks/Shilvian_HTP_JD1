package by.makson.republic;

public class City {
	
	private String nameCity = "Defauult";
	private double population = 0.0;
	
	public City(String nameCity, double population) {
		this.nameCity = nameCity;
		this.population = population;
	}

	public String getNameCity() {
		return nameCity;
	}

	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
	}
	
	
	
	
	

}
