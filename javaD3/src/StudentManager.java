public class StudentManager extends UserManager{
    public void addClass(Student student,int index,String classs)
    {
        student.classes.add(index,classs);

    }
    public void content(Student student)
    {
        for(String content:student.classes)
        {
            System.out.println(content);
        }
    }

}
