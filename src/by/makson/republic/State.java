package by.makson.republic;

public class State {
	
	String nameState = "Default";
	City capital;
	Region region[];
	double squareState = 0.0;
	
	
	public int quantityDistricts() {
		int count = 0;
		for(int i = 0; i < region.length; i++) {
			if(region[i] != null) {
				count++;
			}
		}
		return count;
	}
	
	public void capitalState() {
		System.out.println("The capital of the State is " + capital.getNameCity());
	}
	
	public void regionalCenter() {
		System.out.println("Name city of regional center: ");
		for(int i = 0; i < region.length; i++) {
			if(region[i] != null) {
				System.out.print(region[i].getRegionalCenter().getNameCity() + "\t");
			}
		}
	}
	
	public double squareState() {
		double summ = 0.0;
		for(int i = 0; i < region.length; i++) {
			if(region[i] != null) {
				summ = summ + region[i].getSquare();
			}
		}
		return summ;
	}

}
