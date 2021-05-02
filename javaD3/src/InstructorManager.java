public class InstructorManager extends UserManager{
    public void calculateRaisedPay(Instructor instructor)
    {
        System.out.println("Engin Bey bu ay maaşınız:"+instructor.salary*5);
    }
    public void isPay()
    {
        System.out.println("Maaşınız hesabınıza yatırılmıştır.Güle güle kullanın");
    }
}
