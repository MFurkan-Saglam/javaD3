public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student=new Student("Furkan","sağlam", "12345");
        Instructor instructor=new Instructor("Engin","Demiroğ","123456789",1000000);
        User user=new User();

        StudentManager studentManager=new StudentManager();
        studentManager.addClass(student,0,"eng");
        studentManager.content(student);

        UserManager userManager=new UserManager();
        userManager.isLogin(student);
        userManager.update(instructor);

        InstructorManager instructorManager=new InstructorManager();
        instructorManager.calculateRaisedPay(instructor);
        instructorManager.isPay();
    }
}
