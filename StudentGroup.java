
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class StudentGroup implements GroupOperationService {

	private Student[] students;
	private int indexArray = 0;

	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		return this.students;
	}

	@Override
	public void setStudents(Student[] students) {
		if(students == null) {
			throw new IllegalArgumentException(); 
		}
		this.students = students;
	}

	@Override
	public Student getStudent(int index) {
		if (students[index] == null) {
			throw new IllegalArgumentException();
		} else
			return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		if (student == null) {
			throw new IllegalArgumentException();
		} else if(indexArray == students.length - 1) {
			Student[] temp = students;
		    students = new Student[temp.length + 1];
		    System.arraycopy(temp, 0, students, 0, temp.length);
		}
		students[index] = student;
		indexArray++;
	}

	@Override
	public void addFirst(Student student) {
		if (student == null) {
			throw new IllegalArgumentException();
		} else {
			Student[] temp = students;
			students = new Student[temp.length + 1];
			System.arraycopy(temp, 0, students, 1, temp.length);
			students[0] = student;
		}
	}

	@Override
	public void addLast(Student student) {
		if (student == null) {
			throw new IllegalArgumentException();
		} else if (students[students.length - 1] != null) {
			Student[] temp = students;
			students = new Student[temp.length + 1];
			System.arraycopy(temp, 0, students, 0, temp.length);
			students[students.length - 1] = student;
		} else {
			students[students.length - 1] = student;
		}
	}

	@Override
	public void add(Student student, int index) {
		if (student == null && index < 0 && index >= students.length) {
			throw new IllegalArgumentException();
		} else if (indexArray == students.length - 1 || students[index] != null) {
			Student[] temp = students;
			students = new Student[temp.length + 1];
			int variableArray = temp.length - index;
			System.arraycopy(temp, 0, students, 0, index);
			System.arraycopy(temp, index, students, index + 1, variableArray);

		}
		students[index] = student;
		indexArray++;
	}

	@Override
	public void remove(int index) {
		if (students[index] == null && index >= students.length && index < 0) {
			throw new IllegalArgumentException();
		} else {
			Student[] temp = students;
			students = new Student[temp.length - 1];
			int variableArray = temp.length - index - 1;
			System.arraycopy(temp, 0, students, 0, index);
			System.arraycopy(temp, index + 1, students, index, variableArray);
		}
	}

	@Override
	public void remove(Student student) {
		if (student == null) {
			throw new IllegalArgumentException();
		} else {
			for (int i = 0; i < students.length; i++) {
				if (students[i] != null && students[i] == student) {
					students[i] = null;
				}
			}
		}
	}

	@Override
	public void removeFromIndex(int index) {
		if (index < 0 && index >= students.length) {
			throw new IllegalArgumentException();
		} else {
			for (int i = index + 1; i < students.length; i++) {
				if (students[i] != null) {
					students[i] = null;
				}
			}
		}
	}

	@Override
	public void removeFromElement(Student student) {
		int index = 0;
		if (student == null) {
			throw new IllegalArgumentException();
		} else {
			for (int i = 0; i < students.length; i++) {
				if (students[i] != null && students[i] == student) {
					index = i;
				}
			}
			for (int i = index + 1; i < students.length; i++) {
				if (students[i] != null) {
					students[i] = null;
				}
			}
		}
	}

	@Override
	public void removeToIndex(int index) {
		if (index < 0 && index >= students.length) {
			throw new IllegalArgumentException();
		} else {
			for (int i = 0; i < index; i++) {
				if (students[i] != null) {
					students[i] = null;
				}
			}
		}
	}

	@Override
	public void removeToElement(Student student) {
		int index = 0;
		if (student == null) {
			throw new IllegalArgumentException();
		} else {
			for (int i = 0; i < students.length; i++) {
				if (students[i] != null && students[i] == student) {
					index = i;
				}
			}
			for (int i = 0; i < index; i++) {
				if (students[i] != null) {
					students[i] = null;
				}
			}
		}
	}

	@Override
	public void bubbleSort() {
		int studentIter = 0;
		Student[] temp = students;
		for(int i = 0; i < temp.length; i ++) {
			if(temp[i] != null) {
				students[studentIter] = temp[i];
				studentIter++;
			}
		}
		for (int i = 0; i < students.length; i++) {
			for (int j = i + 1; j < students.length; j++) {
				if (students[i] != null && students[j] != null
						&& students[i].getFullName().compareTo(students[j].getFullName()) > 0) {
					Student tempAr = students[j];
					students[j] = students[i];
					students[i] = tempAr;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {

		Student[] student = new Student[students.length];
		int iter = 0;
		if (date == null) {
			throw new IllegalArgumentException();
		} else {
			for (int i = 0; i < students.length; i++) {
				if (students[i]!=null && students[i].getBirthDate().equals(date) == true) {
					student[iter] = students[i];
					iter++;
				}
			}
		}
		return student;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		Student[] student = new Student[students.length];
		int index = 0;
		if (firstDate == null && lastDate == null) {
			throw new IllegalArgumentException();
		} else {
			for (int i = 0; i < students.length; i++) {
				if (students[i] != null && students[i].getBirthDate().after(firstDate) == true
						&& students[i].getBirthDate().before(lastDate) == true) {
					student[index] = students[i];
					index++;
				}
			}
		}
		return student;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		Student[] student = new Student[students.length];
		int iter = 0;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, days);
		if (date == null) {
			throw new IllegalArgumentException();
		} else {
			for (int i = 0; i < students.length; i++) {
				if (students[i] != null && students[i].getBirthDate().after(date) == true
						&& students[i].getBirthDate().before(calendar.getTime()) == true) {
					student[iter] = students[i];
					iter++;
				}
			}
		}
		return student;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		int age = 0;
		if (indexOfStudent < 0 && indexOfStudent >= students.length) {
			throw new IllegalArgumentException();
		} else {
			for (int i = 0; i < students.length; i++) {
				if (students[i] != null && i == indexOfStudent) {
					Date now = new Date();
					long timeBetween = now.getTime() - students[i].getBirthDate().getTime();
					double yearsBetween = timeBetween / (3.156e+10);
					age = (int) Math.floor(yearsBetween);
				}
			}
		}
		return age;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		Student[] student = new Student[students.length];
		int index = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && this.getCurrentAgeByDate(i) == age) {
				student[index] = students[i];
				index++;
			}
		}
		return student;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		Student[] student = new Student[students.length];
		int iter = 0;
		double maxMark = students[0].getAvgMark();
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getAvgMark() > maxMark) {
				maxMark = students[i].getAvgMark();
			}
		}
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getAvgMark() == maxMark) {
				student[iter] = students[i];
				iter++;
			}
		}

		return student;
	}

	@Override
	public Student getNextStudent(Student student) {
		int index = 0;
		Student stud = null;
		if (student == null) {
			throw new IllegalArgumentException();
		} else {
			for (int i = 0; i < students.length; i++) {
				if (students[i] != null && students[i] == student) {
					index = i;
				}
			}
			for (int i = 0; i < students.length; i++) {
				if (students[i] != null && i == index + 1) {
					stud = students[i];
				}
			}
		}
		return stud;
	}
}
