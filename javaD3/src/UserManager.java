public class UserManager {
    public void isLogin(User user)
    {
        if(user.getPassword().length()!=0)
        {
            System.out.println(user.getName()+" "+user.getSurname()+" "+"giriş yaptı");
        }
    }
    public void update(User user)
    {
        System.out.println(user.getName()+" "+"kişisi güncellendi");
    }
}
