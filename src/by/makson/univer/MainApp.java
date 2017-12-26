package by.makson.univer;

public class MainApp {
	
	public static void main(String[] args) {
		
		Student student2 = null;
		student2 = new Student();
		System.out.println();
		
		student2.age = 28;
		student2.name = "Igor";
		student2.surname = "Petrov";
		student2.enterYear = 2016;
		Student student1 = null;
		student1 = new Student();
		student1.age = 20;
		student1.name = "Aleksandr";
		student1.surname = "Ivanov";
		student1.enterYear = 2017;
		
		Student student3 = new Student();
		student1.age = 25;
		student1.name = "Petrov";
		student1.surname = "Ivanov";
		student1.enterYear = 2015;
		
		Student student4 = new Student();
		student4.age = 21;
		student4.name = "Andrey";
		student4.surname = "Fial";
		student4.enterYear = 2015;
		
		Student student5 = new Student();
		student5.age = 21;
		student5.name = "Aleksandr";
		student5.surname = "Ambr";
		student5.enterYear = 2016;
		
		Student student6 = new Student();
		student6.age = 21;
		student6.name = "Alla";
		student6.surname = "Holod";
		student6.enterYear = 2015;
		
		Group group = new Group();
     	group.student = new Student[10]; //- переменная хранящая 10 ссылок
		
		
  //   	group.number = 1;
//		group.student = student;
//		group.greetNewStudent();
		
		group.student[0] = student2;
		group.student[1] = student1;
		group.student[2] = student3;
		group.student[3] = student4;
		group.student[4] = student5;
		group.student[5] = student6;
		int age = group.calculateAvgAge();
		System.out.println(age);
		group.enterIn2015();
//		group.getMaxEnterNumber();
//		System.out.println(year);
		
		
		
		
		
		
		
		
//		System.out.println("One year latter...");
//		student1 = student;
//		student.age = 53;
		
		System.out.println();
		
		
		
//		student1.age = 17;
//		student1.name = "Aleksandr";
//		student1.surname = "Ivanov";
//		student1.enterYear = 2017;
		
		System.out.println();
	}

}
