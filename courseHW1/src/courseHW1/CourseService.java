package courseHW1;

public class CourseService {
	public void defineCourseToTeacher(Teacher teacher, Course course) {
		System.out.println(teacher.name+" defined as the teacher for the "+ course.name +" course. -> TeacherID:"+teacher.id);
	}
	
	public void addStudetToCourse(Student student, Course course) {
		System.out.println(student.name+" registered for the "+ course.name +" course. -> StudentID:"+student.id);
	}
	
	
	
	

}
