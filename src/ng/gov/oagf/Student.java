package ng.gov.oagf;

public class Student {
    private String University = "FUT Minna";
    private String name;
    private String department;
    private String faculty;
    private String course;
    private int level;
    private String matriculation_number;


    //public void setName(String name) {

       // this.name= name;
   // }

    //public String getName(){

       // return name;
   // }


    public String getUniversity() {
        return University;
    }

    public void setUniversity(String university) {
        University = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;


    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFacaulty() {
        return faculty;
    }

    public void setFacaulty(String facaulty) {
        this.faculty = facaulty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getMatriculation_number() {
        return matriculation_number;
    }

    public void setMatriculation_number(String matriculation_number) {
        this.matriculation_number = matriculation_number;
    }

    public static void main(String[] args) {

        Student studentObject = new Student();
        studentObject.setName("Rakiya");
        studentObject.setMatriculation_number("2001/13444BM");
        //System.out.println(studentObject.getName());
        System.out.println ("University: "+studentObject.getUniversity());
        System.out.println("Student name: "+studentObject.getName());
        System.out.println("student matric no: "+studentObject.getMatriculation_number());


    }

}


