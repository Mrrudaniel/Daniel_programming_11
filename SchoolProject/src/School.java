import java.util.ArrayList;

public class School {
    //Fields
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    String school_name;

    //Constructor
    //School object contains 1 teachers Arraylist, 1 students Arraylist and has its name
    School( ArrayList<Teacher> teachers, ArrayList<Student> students){
        this.school_name= school_name;
        this.teachers= teachers;
        this.students= students;
    }

    //Getter of school name
    public String getSchool_name() {
        return school_name;
    }
    //Setter of school name
    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    //Getter of Teachers name
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
    //Getter of Teacher name
    public ArrayList<Student> getStudents() {
        return students;
    }
}
