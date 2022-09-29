package courseHW1;

public class Course {
	int id;
	String name;
	String teacherName;
	String teacherSurname;
	String category;
	public Course(int id, String name, String teacherName, String teacherSurname, String category) {
		super();
		this.id = id;
		this.name = name;
		this.teacherName = teacherName;
		this.teacherSurname = teacherSurname;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherSurname() {
		return teacherSurname;
	}
	public void setTeacherSurname(String teacherSurname) {
		this.teacherSurname = teacherSurname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	

}
