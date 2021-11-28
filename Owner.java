public class Owner extends User
{
    private boolean isAdmin;
    public Owner(String user_name,String user_email)
    {
        super(user_name,user_email);
        isAdmin = true;
    }

}
