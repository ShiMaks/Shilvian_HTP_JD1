package by.makson.republic;

public class Main {

	public static void main(String[] args) {
		
		
		
		Region brestskay = new Region();
		City capBrest = new City("Brest", 0.344);
	    brestskay.nameRegion = "Brestskaya";
	    brestskay.square = 32786.44;
	    brestskay.regionalCenter = capBrest;
	    
		
		Region vitebskay = new Region();
		City capVitebsk = new City("Vitebsk", 0.363);
		vitebskay.nameRegion = "Vitebskaya";
		vitebskay.square = 40051.34;
		vitebskay.regionalCenter = capVitebsk;
		
		
		Region gomelskay = new Region();
		City capGomel = new City("Gomel", 0.509);
		gomelskay.nameRegion = "Gomelskaya";
		gomelskay.square = 40371.36;
		gomelskay.regionalCenter = capGomel;
		
		
		Region grodnenskay = new Region();
		City capGrodno = new City("Grodno", 0.355);
		grodnenskay.nameRegion = "Grodnenskaya";
		grodnenskay.square = 25126.98;
		grodnenskay.regionalCenter = capGrodno;
		
		
		Region minskay = new Region();
		City capitalState = new City("Minsk", 1.911);
		minskay.nameRegion = "Minskaya";
		minskay.square = 39853.79;
		minskay.regionalCenter = capitalState;
		
		
		Region mogilevskay = new Region();
		City capMogilev = new City("Mogilev", 0.369);
		mogilevskay.nameRegion ="Mogilevskaya";
		mogilevskay.square = 29067.62;
		mogilevskay.regionalCenter = capMogilev;
		
		State Belarus = new State();
		Belarus.capital = capitalState;
		Belarus.region = new Region[10];
		Belarus.region[0] = brestskay;
		Belarus.region[1] = vitebskay;
		Belarus.region[2] = gomelskay;
		Belarus.region[3] = grodnenskay;
		Belarus.region[4] = minskay;
		Belarus.region[5] = mogilevskay;
		
		Belarus.capitalState();
		int quantityDistrict = Belarus.quantityDistricts();
		System.out.println("Quantity district: " + quantityDistrict);
		double square = Belarus.squareState();
		System.out.println("Square of state: " + square);
		Belarus.regionalCenter();
		
		

	}

}
