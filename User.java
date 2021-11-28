public class User
{
   public String user_name,user_email;
   
    public User(String user_name,String user_email)
    {
       this.user_name = user_name;
       this.user_email = user_email;
    }
    void setUserBname(String user_name){
        this.user_name = user_name;
    }
    
    public String getUserName(){
        return(user_name);
    }
    void setUserEmail(String user_email){
        this.user_email = user_email;
    }
    public String getUserEmail(){
        return(user_email);
    }
 
}
