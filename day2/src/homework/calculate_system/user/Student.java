package homework.calculate_system.user;

public class Student extends User{

    public Student(){

    }
    public Student(String name,String password){
        setName(name);
        setPassword(password);
        id = "student";
    }
}
