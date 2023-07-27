package homework.calculate_system.user;

public class Teacher extends User{


    public Teacher(){

    }

    public Teacher(String name,String password){
        setName(name);
        setPassword(password);
        id = "teacher";
    }
}
