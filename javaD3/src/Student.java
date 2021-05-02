import java.util.ArrayList;

public class Student extends User{
    ArrayList<String> classes=new ArrayList<String>();
    public Student(String name,String surname,String password)
    {
        this.name=name;
        this.surname=surname;
        this.password=password;

    }
}
