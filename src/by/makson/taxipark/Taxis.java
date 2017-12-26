package taxipark;

public class Taxis {

	AutoEquipment cars[];
	private int indexArray = 0;

	public Taxis() {
		cars = new AutoEquipment[10];
	}

	public void add(AutoEquipment car) {
		if (indexArray == cars.length - 1) {
			AutoEquipment[] temp = cars;
			cars = new AutoEquipment[temp.length + 1];
			System.arraycopy(temp, 0, cars, 0, temp.length);
		}
		cars[indexArray] = car;
		indexArray++;
	}

	public float calculateCostPark() {
		float cost = 0;
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] != null) {
				cost = cost + cars[i].getCostCar();
			}
		}
		return cost;
	}

	public AutoEquipment[] sortCar() {
		for (int i = cars.length - 1; i > 0; i--) {
			for (int j = 0; j < cars.length; j++) {
				if (cars[i] != null && cars[j] != null && cars[j+1]!=null) {
					if (cars[j].getFuelСonsumption() > cars[j + 1].getFuelСonsumption()) {

						AutoEquipment temp = cars[j];
						cars[j] = cars[j + 1];
						cars[j + 1] = temp;
					}
				}
			}
		}
		return cars;
	}

	public void searchCar(int speedStart, int speedEnd) {
		for (int i = 0; i < cars.length; i++) {
			for (int j = speedStart; j <= speedEnd; j++) {
				if (cars[i] != null && cars[i].getMaxSpeed() == j) {
					System.out.println("Заданным параметрам соотвествует: " + cars[i].getBrandName());
				}
			}
		}
	}

}
