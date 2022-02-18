public class Student {
    //Fields
    private String first_name;
    private String last_name;
    private String grade;
    static int stu_num=1;
    private int id_num;

    //Constructor
    Student(String first_name, String last_name, String grade) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.grade = grade;
        this.id_num = stu_num;
        stu_num++;
    }
    //Get the first name of student
    public String getFirst_name() {
        return first_name;
    }
    //Get the last name of student
    public String getLast_name() {
        return last_name;
    }
    //get the grade of student
    public String getGrade() {
        return grade;
    }
    //Get the id number of student
    public int getId_num() {
        return id_num;
    }




}
