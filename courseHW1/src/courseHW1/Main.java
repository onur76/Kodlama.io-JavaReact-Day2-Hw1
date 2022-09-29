package courseHW1;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Java", "Engin Demirog", "Back-End");
		Course course2 = new Course(2, "JavaScript", "Engin Demirog", "Front-End");
		Course course3 = new Course(3, "C#", "Engin Demirog", "Back-End");
		
		Course[] courses = {course1,course2,course3};
		
		for (Course course : courses) {
			System.out.println(course.id+ " "+ course.name+ " " +course.instructor+ " " +course.category);
		}
		
		CourseService service = new CourseService();
		service.addToBag(course1);
	}

}
