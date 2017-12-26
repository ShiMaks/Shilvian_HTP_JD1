package taxipark;

public class Start {

	public static void main(String[] args) {
		
		AutoEquipment car1 = new Car();
		car1.setBrandName("BMW");
		car1.setCostCar(15025.45f);
		car1.setFuelСonsumption(12.2f);
		car1.setMaxSpeed(250);
		
		AutoEquipment car2 = new Truck();
		car2.setBrandName("Volvo");
		car2.setCostCar(45000.5f);
		car2.setFuelСonsumption(30.2f);
		car2.setMaxSpeed(180);
		
		AutoEquipment car3 = new Minivan();
		car3.setBrandName("Volkswagen");
		car3.setCostCar(12000.12f);
		car3.setFuelСonsumption(6.5f);
		car3.setMaxSpeed(205);
		
		AutoEquipment car4 = new Bus();
		car4.setBrandName("MAZ");
		car4.setCostCar(50000.45f);
		car4.setFuelСonsumption(32.4f);
		car4.setMaxSpeed(120);
		
		AutoEquipment car5 = new Car();
		car5.setBrandName("Audi");
		car5.setCostCar(25000.56f);
		car5.setFuelСonsumption(12.4f);
		car5.setMaxSpeed(245);
		
		Taxis taxis = new Taxis();
		taxis.add(car1);
		taxis.add(car2);
		taxis.add(car3);
		taxis.add(car4);
		taxis.add(car5);
		
		//Стоимость автопарка
		System.out.println("Общая стоимость парка автомобилей составляет: " + taxis.calculateCostPark());
		
		//Сортировка по расходу топлива
		AutoEquipment[] cars = new AutoEquipment[5];
        cars  = taxis.sortCar();
        for(int i = 0; i < cars.length; i++) {
        	if(cars[i] != null) {
        		System.out.println(cars[i].getBrandName());
        	}
        }
        
        //Выбор автомобиля по заданному диапазону скоростей
 //      taxis.searchCar(187, 280);
	}

}
