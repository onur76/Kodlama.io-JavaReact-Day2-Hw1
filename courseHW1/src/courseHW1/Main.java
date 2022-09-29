package courseHW1;

public class Main {

	public static void main(String[] args) {
		
		Teacher teacher1 = new Teacher(1, "Engin", "DEMIROG");
		Teacher teacher2 = new Teacher(2, "Ali", "ASLAN");
		Teacher teacher3 = new Teacher(3, "Selim", "KILIC");
		
		Student student1 = new Student(1, "Onur Can", "AKKOYUN");
		Student student2 = new Student(2, "Ahmet", "KIZILDAG");
		Student student3 = new Student(3, "Hasan", "KOPRULU");
		
		
		Course course1 = new Course(1, "Java", teacher1.getName(),teacher1.surname, "Back-End");
		Course course2 = new Course(2, "C#",  teacher2.getName(),teacher2.surname, "Back-End");
		Course course3 = new Course(3, "JavaScript", teacher3.getName(),teacher3.surname, "Front-End");
		
		Course[] courses = {course1,course2,course3};
		
		CourseService service = new CourseService();
		
		service.defineCourseToTeacher(teacher1, course1);
		service.defineCourseToTeacher(teacher2, course2);
		service.defineCourseToTeacher(teacher3, course3);
		
		service.addStudetToCourse(student1, course1);
		
		for (Course course : courses) {
			System.out.print("\n" + course.id+ " "+ course.name+ " " +course.category);
		}
		
		
		
		
	}

}
