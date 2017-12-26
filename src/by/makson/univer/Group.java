package by.makson.univer;

public class Group {
	
	int number = 3;
	Student student[];
	
	public void greetNewStudent() {
		System.out.println("Hello Student");
	}
	
	public int calculateAvgAge() {
		int age = 0;
		int count = 0;
		for(int i = 0; i < student.length; i++) {
			if(student[i] != null) {
			age = age + student[i].age;
			count++;
			}
		}
		
		int mediumAge = age/count;
		return mediumAge;
	}
	
	public void getMaxEnterNumber() {
		int enterYear = 2000;
		int count = 0;
		int countIter = 0;
		int maxCount = 0;
		int maxYear = 2000;
		for(int i = 0; i < student.length; i++) {
			if(student[i] != null) {
			enterYear = student[i].enterYear;
				for(int j = 0; j < student.length; j++) {
					if(student[j] != null && student[j].enterYear == enterYear) {
						countIter++;
					}
				}
			if(countIter > count) {
				maxYear = enterYear;
				maxCount = countIter;
			}
			count = countIter;
			countIter = 0;
		}
		}	
//		int maxPeople = maxYear[0];
//		for(int i = 0; i < maxYear.length; i++) {
//			if (maxYear[i] > maxPeople) {
//				maxPeople = maxYear[i];
//			}
//		}
		System.out.println("Год в который поступило наибольшее кол-во учеников: " + maxYear + " " + " Кол-во учеников: " + maxCount);
	}
	
	public void enterIn2015() {
		int enterYear = 2015;
		int count = 0;
		for(int i = 0; i < student.length; i++) {
			if(student[i] != null && student[i].enterYear == enterYear) {
				count++;
			}
		}
		System.out.println("В 2015 году в университет поступило: " + count);
	}

}
