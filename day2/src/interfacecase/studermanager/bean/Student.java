package interfacecase.studermanager.bean;

public class Student {
    private String name;
    private String gender;
    private double grade;

    public Student() {
    }
    public Student(String name,String gender,double grade){
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
