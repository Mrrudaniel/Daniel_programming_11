import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Create teachers. There are 3 teachers totally
        Teacher t1= new Teacher();
        t1.setFirst_name("Lucian");
        t1.setLast_name("Barton");
        t1.setSubject("Math");

        Teacher t2= new Teacher();
        t2.setFirst_name("Andre");
        t2.setLast_name("Bryan");
        t2.setSubject("English");

        Teacher t3= new Teacher();
        t3.setFirst_name("Armani");
        t3.setLast_name("Gamble");
        t3.setSubject("Music");

        //System.out.println("Name:"+t1.getFirst_name()+" "+t1.getLast_name()+'\t'+"Subject:"+t1.getSubject());
        //System.out.println("Name:"+t2.getFirst_name()+" "+t2.getLast_name()+'\t'+"Subject:"+t2.getSubject());
        //System.out.println("Name:"+t3.getFirst_name()+" "+t3.getLast_name()+'\t'+"Subject:"+t3.getSubject());

        //Create the teachers Arraylist
        ArrayList<Teacher> kits_teacher = new ArrayList<>();
        kits_teacher.add(t1);
        kits_teacher.add(t2);
        kits_teacher.add(t3);

        //Create Students. There are 10 students in the Arraylist
        Student s1 = new Student ("Nora", "Henderson", "10");
        Student s2 = new Student ("Trevon", "Cherry", "10");
        Student s3 = new Student ("Quinn", "Carr", "10");
        Student s4 = new Student ("Rachael", "Rider", "11");
        Student s5 = new Student ("Marvin", "Brewer", "11");
        Student s6 = new Student ("Skylar", "Molina", "11");
        Student s7 = new Student ("Hudson", "Quinn", "12");
        Student s8 = new Student ("Johan", "Bowers", "12");
        Student s9 = new Student ("Jerry", "Chen", "12");
        Student s10 = new Student ("Addison", "Wu", "12");

        //Creat the student Arraylist
        ArrayList<Student> kits_student = new ArrayList<>();
        kits_student.add(s1);
        kits_student.add(s2);
        kits_student.add(s3);
        kits_student.add(s4);
        kits_student.add(s5);
        kits_student.add(s6);
        kits_student.add(s7);
        kits_student.add(s8);
        kits_student.add(s9);
        kits_student.add(s10);

        //Create the School
        School kits = new School(kits_teacher, kits_student);
        kits.setSchool_name("Kitsilano Secindary");
        System.out.println("School name: "+kits.getSchool_name());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        //Fetcg all the teachers in the Arraylist
        System.out.println("There are " + kits.getTeachers().size()+ "teachers in the school");
        for (int i=0;i<kits.getTeachers().size();i++){
            String first_name= kits.getTeachers().get(i).getFirst_name();
            String last_name= kits.getTeachers().get(i).getLast_name();
            String subject= kits.getTeachers().get(i).getSubject();
            System.out.println("Teacher: "+first_name +" "+ last_name +'\t'+"Subject: "+subject);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        //Fetch all the students in the Arraylist
        System.out.println("There are " + kits.getStudents().size()+ "students in the school");
        for (int j=0; j<kits_student.size();j++){
            String f_name= kits.getStudents().get(j).getFirst_name();
            String l_name= kits.getStudents().get(j).getLast_name();
            String g_name= kits.getStudents().get(j).getGrade();
            int stu_num= kits.getStudents().get(j).getId_num();
            System.out.println("ID: " + stu_num+ "\n"+"Student: " + f_name + " "+ l_name+ "\t"+ "Grade: "+ g_name);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        //Remove the last element in the teacher's Arraylist
        kits.getTeachers().remove(kits_teacher.size()-1);
        System.out.println("There are " + kits_teacher.size() + " teachers after removing 1 teacher");
        for(int i=0; i<kits.getTeachers().size();i++) {
            //System.out.println("Teacher: " + kits.getTeachers().get(i).getFirst_name() + " "+kits.getTeachers());
            System.out.println(""+kits.getTeachers().get(i).getFirst_name()+" "+ kits.getTeachers().get(i).getLast_name()+ " "+ kits.getTeachers().get(i).getSubject());
        }

        //Remove 2 students in the student's Arraylist
        for (int i=0; i<2; i++) {
            kits_student.remove(kits_student.size()-1);
        }
        System.out.println("There are "+ kits_student.size() + "students left after removing 2 students");
        for(int j=0; j< kits.getStudents().size();j++){
            System.out.println("ID "+ kits.getStudents().get(j).getId_num());
            System.out.println("Student: " +kits.getStudents().get(j).getFirst_name()+ " " + kits.getStudents().get(j).getLast_name()+ " " + kits.getStudents().get(j).getGrade());
        }








    }
}
